/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week4.odev1.customer;

import com.mycompany.week4.odev1.company.CompanyManager;
import com.mycompany.week4.odev1.company.ICompany;
import com.mycompany.week4.odev1.fly.Fly;
import com.mycompany.week4.odev1.planet.Seat;
import com.mycompany.week4.odev1.planet.SeatType;

/**
 *
 * @author Asus
 */
public class CustomerTicket {

    private String personName;
    private Fly fly;
    private Seat seat;

    public CustomerTicket(String personName) {
        this.personName = personName;
    }

    public CustomerTicket(String personName, Fly fly, Seat seat) {
        this.personName = personName;
        this.fly = fly;
        this.seat = seat;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Fly getFly() {
        return fly;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public void ticketInfo() {
        System.out.println("\n\n============Bilet Bilgileri===========\n"
                + "Isim soyisim: " + this.personName + "\n"
                + "Koltuk Numarasi: " + this.seat.getNumber() + "\n"
                + "Ucus Tipi: " + this.seat.getType().getValue()
        );
        fly.flyInfo();
        System.out.println("------Ekstra Hizmetler-------");
        CompanyManager co = new CompanyManager((ICompany) fly.getCompany());
        System.out.println(co.hizmet(fly, this));
        System.out.println("-------Bilet Tutari-------");
        System.out.println("Vergi Dahil:" + co.totalPrice(fly, this) + "\n" + "Vergisiz Fiyat: " + fly.getNotTaxPrice());
        System.out.println("===========================================");
    }

}
