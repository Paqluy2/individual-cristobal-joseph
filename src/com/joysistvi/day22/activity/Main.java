package com.joysistvi.day22.activity;

public class Main {
    public static void main(String[] args) {


        Ballpen myBallpen = new Ballpen("Pilot", "Black", 20.0, 0.75);


        Marker myMarker = new Marker("MARKER", "Red", 35.0, true);


        GelPen myGelPen = new GelPen("Gelly Roll", "Blue", 15.5, 0.5, true);


        System.out.println("=== Ballpen ===");
        System.out.println(myBallpen);
        myBallpen.write();

        System.out.println("\n=== Marker ===");
        System.out.println(myMarker);
        myMarker.write();

        System.out.println("\n=== GelPen ===");

        System.out.println(myGelPen);
        myGelPen.write();
    }
}
