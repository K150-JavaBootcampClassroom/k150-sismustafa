/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentcars.Service;

import com.mycompany.rentcars.Car.Car;
import com.mycompany.rentcars.Customer.Customer;

/**
 *
 * @author Asus
 */
public abstract class ServiceInfo {

    public void carInfo(Customer customer) {
        Car customerCar = customer.getCar();
        System.out.println("------Arac Bilgileri------------");
        if (customerCar != null) {
            System.out.println(" Markasi: " + customerCar.getBrand() + "\n"
                    + " Modeli: " + customerCar.getModel() + "\n"
                    + " Yili: " + customerCar.getYear() + "\n"
                    + " Motoru: " + customerCar.getEngine() + "\n"
                    + " Kiralama Fiyati: " + customerCar.getPrice());
        } else {
            System.out.println("Kiralanan bir arac mevcut degil!\nAna Sayfadan Arac kiralaybilirsiniz...");
        }

    }

    public void customerInfo(Customer customer) {
        System.out.println("------Kullanici Bilgileri------------");
        System.out.println(" isim soyismi/sirket ismi: " + customer.getName() + "\n"
                + " maili: " + customer.getMail());
        if (customer.getCar() != null) {
            System.out.println(" Mevcut Aracin kiralanan gun sayisi: " + customer.getTotalDay() + "\n"
                    + " Mevcut arac icin odenen tutar: " + customer.getTotalPayment());
        }
    }

}
