/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week4.odev1.company;

import com.mycompany.week4.odev1.plane.Plane;

/**
 *
 * @author Asus
 */
public class Company {

    private String name;
    private Plane plane;

    public Company(String name, Plane plane) {
        this.name = name;
        this.plane = plane;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plane getPlanet() {
        return plane;
    }

    public void setPlanet(Plane plane) {
        this.plane = plane;
    }

}
