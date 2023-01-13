/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week4.odev1.company;

import com.mycompany.week4.odev1.customer.CustomerTicket;
import com.mycompany.week4.odev1.fly.Fly;
import com.mycompany.week4.odev1.fly.FlyType;
import com.mycompany.week4.odev1.planet.Planet;
import com.mycompany.week4.odev1.planet.SeatType;

/**
 *
 * @author Asus
 */
public class Pegasus extends Company implements ICompany {

    public Pegasus() {
        super("Pagasus", new Planet("bartin", "Boeing 747"));
    }

    @Override
    public String speciaServicesForFly(Fly fly, CustomerTicket customerTicket) {
        String status = "";
        if (fly.getFlyType() == FlyType.YURTICI && customerTicket.getSeat().getType() == SeatType.BUISNESS) {
            status = "Yemek ikram Hizmeti mevcut";
        } else if (fly.getFlyType() == FlyType.YURTICI && customerTicket.getSeat().getType() == SeatType.ECONOMIC) {
            status = "Yemek ikram Hizmeti mevcut";
        } else {
            status = "Yemek ikram Hizmeti mevcut";
        }
        return status;
    }

    @Override
    public int getPrice(Fly fly, CustomerTicket customerTicket) {
        int newprice = fly.getNotTaxPrice();
        if (customerTicket.getSeat().getType() == SeatType.BUISNESS) {
            newprice *= 2.2;
        } else {
            newprice *= 1.6;
        }
        return newprice;
    }
}
