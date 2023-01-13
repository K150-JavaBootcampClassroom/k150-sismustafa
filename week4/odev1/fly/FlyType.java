/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week4.odev1.fly;

/**
 *
 * @author Asus
 */
public enum FlyType {

    YURTICI("yurt ici"),
    YURTDISI("yurt disi");

    private String type;

    private FlyType(String type) {
        this.type = type;
    }

    public String getValue() {
        return this.type;
    }
}
