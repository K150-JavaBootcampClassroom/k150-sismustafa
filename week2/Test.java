/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentcars;

import com.mycompany.rentcars.Customer.Person;
import com.mycompany.rentcars.Customer.Company;
import com.mycompany.rentcars.Customer.Customer;
import com.mycompany.rentcars.Car.Car;
import com.mycompany.rentcars.Car.Hatchback;
import com.mycompany.rentcars.Car.Sedan;
import com.mycompany.rentcars.Car.Suv;
import com.mycompany.rentcars.Service.CompanyService;
import com.mycompany.rentcars.Service.PersonService;
import com.mycompany.rentcars.Service.ServiceManger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Test {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Customer> musteriler = new ArrayList<>();
    static ArrayList<Car> arabalar = new ArrayList<>();
    static ServiceManger serviceManger;

    public static void main(String[] args) {
        Company com1 = new Company("facebook", "info@facebook.com", "1234");
        Company com2 = new Company("twitter", "info@twitter.com", "1234");
        Person p1 = new Person("mustafa sis", "sis@gmail.com", "1234");
        Person p2 = new Person("talha Cigdem", "talha@gmail.com", "1234");

        Sedan mercedes180 = new Sedan("mercedes", "c180", 2014, 300);
        Sedan bmw320 = new Sedan("BMW", "320", 2014, 300);
        Hatchback leon = new Hatchback("Seat", "leon", 2022, 500);
        Hatchback ibiza = new Hatchback("Seat", "ibiza", 2019, 300);
        Suv x5 = new Suv("Bmw", "X5", 2014, 500);
        Suv q7 = new Suv("Audi", "Q7", 2017, 700);

        musteriler.add(com1);
        musteriler.add(com2);
        musteriler.add(p1);
        musteriler.add(p2);

        arabalar.add(mercedes180);
        arabalar.add(bmw320);
        arabalar.add(leon);
        arabalar.add(ibiza);
        arabalar.add(x5);
        arabalar.add(q7);

        boolean exitApp = false;
        do {
            System.out.println("\n---------------\nuygulamayi sonlandirmak icin maile 'cikis' sifreye '1' yaziniz");
            System.out.println("Giris Yapiniz");
            String mail, pass;
            System.out.println("=============================");
            System.out.print("Mail adresini giriniz: ");
            mail = sc.nextLine();
            System.out.print("Sifrenizi Giriniz: ");
            pass = sc.nextLine();
            System.out.println("=============================");

            bitir:
            for (Customer cs : musteriler) {
                if (mail.equals("cikis")) {
                    exitApp = true;
                    break;
                }
                if (cs.getMail().equals(mail) && cs.getPassword().equals(pass)) {
                    String temp = cs.getClass().getSimpleName();
                    switch (temp) {
                        case "Person":
                            serviceManger = new ServiceManger(new PersonService(cs, arabalar));
                            serviceManger.run();
                            break;
                        case "Company":
                            serviceManger = new ServiceManger(new CompanyService(cs, arabalar));
                            serviceManger.run();
                            break;
                    }

                }
            }

        } while (!exitApp);

    }

}
