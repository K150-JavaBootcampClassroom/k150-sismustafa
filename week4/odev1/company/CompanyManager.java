/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week4.odev1.company;

import com.mycompany.week4.odev1.customer.CustomerTicket;
import com.mycompany.week4.odev1.fly.Fly;

/**
 *
 * @author Asus
 */
public class CompanyManager {

    private ICompany company;

    public CompanyManager(ICompany company) {
        this.company = company;
    }

    public String hizmet(Fly fly, CustomerTicket customerTicket) {
        return this.company.speciaServicesForFly(fly, customerTicket);
    }
    
    public int totalPrice(Fly fly, CustomerTicket customerTicket){
        return this.company.getPrice(fly, customerTicket);
    }
    
   

}
