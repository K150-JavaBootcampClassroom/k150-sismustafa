/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week4.odev1.planet;

/**
 *
 * @author Asus
 */
public enum SeatType {
    ECONOMIC("Ekonomik"),
    BUISNESS("Buisness");

    private String type;

    private SeatType(String type) {
        this.type = type;
    }

    public String getValue() {
        return this.type;
    }
}
