/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
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
public interface IService {

    public boolean transactions();

    public void allCar();

    public void selectCarMenu();

    public void selectCarProcess(Customer customer, Car car, int day, int price);

    public void infoMenu();

}
