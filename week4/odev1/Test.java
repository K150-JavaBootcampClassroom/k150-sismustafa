/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week4.odev1;

import com.mycompany.week4.odev1.company.Company;
import com.mycompany.week4.odev1.company.Pegasus;
import com.mycompany.week4.odev1.company.TurkishAirlines;
import com.mycompany.week4.odev1.customer.CustomerTicket;

import com.mycompany.week4.odev1.fly.Fly;
import com.mycompany.week4.odev1.fly.FlyType;
import com.mycompany.week4.odev1.planet.Planet;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Asus
 */
public class Test {

    public static void main(String[] args) {

        //Musteriler 
        CustomerTicket ms = new CustomerTicket("mustafa sis");
        CustomerTicket tc = new CustomerTicket("Talha cigdem");

        // havayolu sirketleri
        TurkishAirlines thy = new TurkishAirlines();
        Pegasus pg = new Pegasus();

        // havayollarina ait seferler 
        Fly fly1 = new Fly(thy, "elazig", "ankara", FlyType.YURTICI, 200);
        Fly fly2 = new Fly(thy, "istanbul", "almanya", FlyType.YURTDISI, 400);

        Fly fly3 = new Fly(pg, "elazig", "ankara", FlyType.YURTICI, 150);
        Fly fly4 = new Fly(pg, "istanbul", "almanya", FlyType.YURTDISI, 300);

        // tum seferlerin bulundugu liste
        ArrayList<Fly> tumFly = new ArrayList<>(Arrays.asList(fly1, fly2, fly3, fly4));

        // seferleri listeleme
        for (Fly i : tumFly) {
            i.flyInfo();
        }

        // Musterinin Sefer seceimi 
        ms.setFly(fly2);

       
        Planet tempPl = fly2.getCompany().getPlanet();

        // ucaga ait bos koltuklari listeleme
        tempPl.emptySeats();

        // musterinin koltuk secimi
        tempPl.selectSeat(ms, 4);

        // 

        ms.ticketInfo();

    }
}
