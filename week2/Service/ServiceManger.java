/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentcars.Service;

import com.mycompany.rentcars.Car.Car;
import com.mycompany.rentcars.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ServiceManger {

    private IService iSerive;

    public ServiceManger(IService iService) {
        this.iSerive = iService;

    }

    public IService getIService() {
        return this.iSerive;
    }

    public void setIservice(IService iservice) {
        this.iSerive = iservice;
    }

    public void run() {
        iSerive.transactions();
    }
}
