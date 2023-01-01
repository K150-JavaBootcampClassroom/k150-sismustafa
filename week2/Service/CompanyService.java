/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentcars.Service;

import com.mycompany.rentcars.Car.Car;
import com.mycompany.rentcars.Customer.Customer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class CompanyService extends ServiceInfo implements IService {

    private Scanner sc = new Scanner(System.in);
    private Boolean isExit = false;

    private Customer customer;
    private ArrayList<Car> cars;

    public CompanyService(Customer customer, ArrayList<Car> cars) {
        this.customer = customer;
        this.cars = cars;
    }

    @Override
    public boolean transactions() {
        System.out.println("Kurumsal Hesap");
        System.out.println("=============================");
        System.out.println("Islem Seciniz\n----------");
        System.out.println("1- Araba Kiralayiniz: '1' e tiklayiniz  ");
        System.out.println("2- Bilgileriniz icin  '2' e tiklayiniz ");
        System.out.println("3- Cikis yapmak icin  '-1'e tiklayiniz ");

        System.out.print("isleminiz: ");
        int temp = sc.nextInt();
        switch (temp) {
            case 1:
                allCar();
                break;
            case 2:
                infoMenu();
                break;
            case -1:
                this.isExit = true;
                break;
            default:
                System.out.println("Gecersiz Islem");
                break;
        }

        return isExit;
    }

    @Override
    public void allCar() {
        if (customer.getCar() == null) {
            System.out.println("Kiralanabilinir Arabalar\n--------------------");
            for (int i = 0; i < cars.size(); i++) {
                if (cars.get(i).getCustomer() == null) {
                    System.out.println(i + " ID'li araba: "
                            + cars.get(i).getModel()
                            + " : Fabrika yili " + cars.get(i).getYear() + "  Gunluk fiyat: "
                            + cars.get(i).getPrice());
                }

            }
            System.out.println("----------------------------------------");
            System.out.println("1- Kiralama islemine devam etmek icin '1' e tiklayiniz...\n2- Menuye donmek icin '0' e tiklayiniz...");
            System.out.print("isleminiz: ");
            int temp = sc.nextInt();
            switch (temp) {
                case 1 ->
                    selectCarMenu();
                case 0 ->
                    transactions();
                default -> {
                }
            }
        } else {
            System.out.println("Zaten kiraladiginiz bir arac mevcut!..");
            transactions();
        }
    }

    @Override
    public void selectCarMenu() {
        System.out.println("------------Araba kiralama Islmei----------------");
        System.out.print("Arabanin idsini giriniz: ");
        int carId = sc.nextInt();
        Car car = cars.get(carId);
        System.out.print("Kullanilacak gun miktarini giriniz: ");
        int carDay = sc.nextInt();
        System.out.println("-------------\nFatura\n-------------");
        int totalPrice = carDay * car.getPrice();
        System.out.println("Fiyat: " + car.getPrice() + " x " + " Gun: " + carDay + " = " + totalPrice + " TL");
        selectCarProcess(customer, car, carDay, totalPrice);
    }

    @Override
    public void selectCarProcess(Customer customer, Car car, int day, int price) {
        customer.setTotalDay(day);
        customer.setTotalPayment(price);
        customer.setCar(car);
        car.setCustomer(customer);
        System.out.println("Isleminiz Basarili.\nAna menuden size ait bilgilerden borcunuzu ve \nkiraladiginiz arac bilgilerini gorebilirsiniz");
        transactions();
    }

    @Override
    public void infoMenu() {
        System.out.println("------------\nMevcut Bilgiler Menusu\n----------");
        System.out.println("1- Kullanici Bilgileri icin '1' e tiklaynizi");
        System.out.println("2- Kiralanan Mevcut Arac bilgileri icin '2' e tiklayiniz");
        System.out.println("3- Ana Menuye donmek icin '3' a tiklayiniz");
        System.out.print("Isleminiz: ");
        int temp = sc.nextInt();
        switch (temp) {
            case 1 ->
                customerInfo(customer);
            case 2 ->
                carInfo(customer);
            case 3 ->
                transactions();
            default -> {
            }

        }
    }

    @Override
    public void carInfo(Customer customer) {
        super.carInfo(customer);
        infoMenu();
    }

    @Override
    public void customerInfo(Customer customer) {
        super.customerInfo(customer);
        infoMenu();
    }
}
