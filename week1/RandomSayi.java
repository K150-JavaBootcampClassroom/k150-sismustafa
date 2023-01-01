/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kodluyoruz;

import java.util.Random;

/**
 *
 * @author Asus
 */
public class RandomSayi {

    public static void main(String[] args) {
        Random random = new Random();
        boolean isNumber = false;
        int sayac = 0;
        while (!isNumber) {
            int temp = random.nextInt(500);
            sayac++;
            if (temp > 50 && temp < 100) {
                System.out.println("Sayi Bulundu!");
                System.out.println("Bulunan Sayi: " + temp);
                System.out.println("Sayinin bulunmasi icin toplam uretilen sayi miktari: " + sayac);
                isNumber = true;
            }
        }

    }

}
