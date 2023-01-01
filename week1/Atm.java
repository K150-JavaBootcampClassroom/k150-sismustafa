/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kodluyoruz;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Atm {

    private int bakiye = 0;

    public Atm(int bakiye) {
        this.bakiye = bakiye;
    }

    public int getBakiye() {
        return this.bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void paraCekme(int miktar) {
        if (miktar > 0 && this.bakiye - miktar >= 0) {
            this.bakiye -= miktar;
            System.out.println("Kalan Bakiye: " + this.bakiye);
        } else {
            System.out.println("Yetersiz Bakiye!.. veya Hatali Deger!... Tekrar Deneyin.");
        }

    }

    public void paraYatirma(int miktar) {
        if (miktar > 0) {
            this.bakiye += miktar;
            System.out.println("Toplam Bakiye : " + this.bakiye);
        }

    }

    public void bakiyeSorgula() {
        System.out.println("Bakiyeniz: " + this.bakiye);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Baslangic olarak bir bakiye miktari giriniz: ");
        Atm atm = new Atm(sc.nextInt());
        System.out.println("\n\n======= Kodluyoruz Bank - Atm ============");
        int islem;
        do {
            System.out.println("\nIslem Seciniz:");
            System.out.print("1-Para Cekme\n2-Para Yatirma\n3-Bakiye Sorgulama\nCikmak icin: \"-1\"\n");
            System.out.print("isleminiz : ");
            islem = sc.nextInt();

            switch (islem) {
                case 1:
                    System.out.println("\n===========\nCekilecek tutari giriniz: ");
                    atm.paraCekme(sc.nextInt());
                    System.out.println("===========");
                    break;
                case 2:
                    System.out.println("\n===========\nEkleyenecegiz tutari giriniz: ");
                    atm.paraYatirma(sc.nextInt());
                    System.out.println("===========");
                    break;
                case 3:
                    System.out.println("\n===========");
                    atm.bakiyeSorgula();
                    System.out.println("===========");
                    break;
            }

        } while (islem != -1);

    }

}
