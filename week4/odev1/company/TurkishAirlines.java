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
public class TurkishAirlines extends Company implements ICompany {

    public TurkishAirlines() {
        super("TurkishAirlines", new Planet("corum", "Boeing 747"));
    }

    @Override
    public String speciaServicesForFly(Fly fly, CustomerTicket customerTicket) {
        String status;
        if (fly.getFlyType() == FlyType.YURTICI && customerTicket.getSeat().getType() == SeatType.BUISNESS) {
            status = "Yemek ikram Hizmeti mevcut";
        } else if (fly.getFlyType() == FlyType.YURTICI && customerTicket.getSeat().getType() == SeatType.ECONOMIC) {
            status = "Herhangi bir hizmet mevcut degildir";
        } else {
            status = "Yemek ikram Hizmeti mevcut";
        }
        return status;
    }

    @Override
    public int getPrice(Fly fly, CustomerTicket customerTicket) {
        int newprice = fly.getNotTaxPrice();
        if (customerTicket.getSeat().getType() == SeatType.BUISNESS) {
            newprice *= 2.5;
        } else {
            newprice *= 1.8;
        }
        return newprice;
    }

}
