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
public interface ICompany {

    public int getPrice(Fly fly, CustomerTicket customerTicket);

    public String speciaServicesForFly(Fly fly, CustomerTicket customerTicket);

}
