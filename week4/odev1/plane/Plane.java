/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.week4.odev1.plane;

import com.mycompany.week4.odev1.customer.CustomerTicket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import javax.swing.text.html.CSS;

/**
 *
 * @author Asus
 */
public class Plane {

    private String planetName;
    private String model;
    private ArrayList<Seat> seats;

    {
        seats = new ArrayList<>();
        seats.add(new Seat("A1", SeatType.BUISNESS));
        seats.add(new Seat("A2", SeatType.BUISNESS));
        seats.add(new Seat("A3", SeatType.BUISNESS));
        seats.add(new Seat("A4", SeatType.BUISNESS));
        seats.add(new Seat("A5", SeatType.BUISNESS));
        seats.add(new Seat("A6", SeatType.ECONOMIC));
        seats.add(new Seat("A7", SeatType.ECONOMIC));
        seats.add(new Seat("A8", SeatType.ECONOMIC));
        seats.add(new Seat("A9", SeatType.ECONOMIC));
        seats.add(new Seat("A10", SeatType.ECONOMIC));

    }

    public Plane(String planetName, String model) {
        this.planetName = planetName;
        this.model = model;
    }

    public String getPlanetName() {
        return this.planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public void emptySeats() {
        System.out.println("------Secili Sefere Ait Bos Koltuklar--------\n");
        System.out.println("Secebileceginiz Bos Koltuklar\n-----------------");
        int emptyCount = 0;
        for (int i = 0; i < seats.size(); i++) {

            if (seats.get(i).isIsEmpty() == false) {
                emptyCount++;
                System.out.println("\n------------");
                System.out.println(seats.get(i).getNumber() + " nolu koltuk;\nKoltuk tipi: " + seats.get(i).getType().getValue()
                        + "\nKoltuk Durumu : Bos"
                );
            }

        }
        System.out.println("-----------------\nToplam bos koltuk Sayisi: " + emptyCount);
    }

    public void selectSeat(CustomerTicket cs, int seatNumber) {
        Seat tempSeat = seats.get(seatNumber);
        if (tempSeat.isIsEmpty() == false) {
            tempSeat.setIsEmpty(true);
            cs.setSeat(tempSeat);
        }
    }

    public Seat getSeat(int seatNumber) {
        return this.seats.get(seatNumber);

    }
}
