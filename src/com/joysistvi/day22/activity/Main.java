package com.joysistvi.day22.activity;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Calling methods on Pen references ===");


        Pen genericPen = new Pen("Generic", "Blue", 15.0);
        Pen myBallpen = new Ballpen("Pilot", "Black", 20.0, 0.75);
        Pen myMarker = new Marker("MARKER", "Red", 35.0, true);
        Pen myGelPen = new GelPen("Gelly Roll", "Blue", 15.5, 0.5, true); // Kept your GelPen!


        System.out.println("--- Pen ---");
        genericPen.write();
        genericPen.refill();

        System.out.println("\n--- Ballpen ---");
        myBallpen.write();
        myBallpen.refill();

        System.out.println("\n--- Marker ---");
        myMarker.write();
        myMarker.refill();


        System.out.println("\n=== testPen() ===");
        testPen(genericPen);
        System.out.println();

        testPen(myBallpen);
        System.out.println();

        testPen(myMarker);
        System.out.println();

        testPen(myGelPen);
        System.out.println();


        System.out.println("=== Overloading ===");
        myMarker.write("Hello");
        myMarker.write("Hello", 3);
    }

    public static void testPen(Pen pen) {
        System.out.println(pen);
        pen.write();
        pen.refill();
    }
}

/*
 * Part 5: Takeaway
 * Method overloading (compile-time) happens when multiple methods in the SAME class
 * share the exact same name but have different parameters (like write() vs write(String)).
 * Method overriding (runtime) happens when a CHILD class replaces a parent's method
 * (like Ballpen replacing Pen's write()) to provide its own specific, customized behavior.
 */