/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week4.odev1.fly;

import com.mycompany.week4.odev1.company.Company;
import com.mycompany.week4.odev1.country.Turkey;
import com.mycompany.week4.odev1.planet.Planet;
import java.util.HashMap;

/**
 *
 * @author Asus
 */
public class Fly {

    private Company company;
    private FlyType flyType;
    private String from;
    private String to;
    private int notTaxPrice;

    public Fly(Company company, String from, String to, FlyType flyType, int price) {
        this.company = company;
        this.flyType = flyType;
        this.from = from;
        this.to = to;
        this.notTaxPrice = price;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public FlyType getFlyType() {
        return flyType;
    }

    public void setFlyType(FlyType flyType) {
        this.flyType = flyType;
    }

    public void flyInfo() {
        System.out.println("--------Sefer Bilgileri----------\n"
                + "Sirket : " + getCompany().getClass().getSimpleName() + "\n"
                + "Sefet Tipi: " + getFlyType().getValue() + "\n"
                + getFrom() + " 'dan " + getTo() + " 'a");
    }

    public int getNotTaxPrice() {
        return notTaxPrice;
    }

    public void setNotTaxPrice(int notTaxPrice) {
        this.notTaxPrice = notTaxPrice;
    }

}
