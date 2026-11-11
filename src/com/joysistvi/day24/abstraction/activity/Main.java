package com.joysistvi.day24.abstraction.activity;

public class Main {
    public static void main(String[] args) {

        Ballpen myBallpen = new Ballpen("Pilot", "Black", 20.0, 1.0);
        Marker myMarker = new Marker("Pentel", "Red", 35.0, true);

        System.out.println("=== testPen() ===");
        testPen(myBallpen);
        System.out.println();
        testPen(myMarker);
        System.out.println();

        System.out.println("=== testRefillable() ===");
        testRefillable(myBallpen);
        System.out.println();
        testRefillable(myMarker);
        System.out.println();

        System.out.println("=== testClickable() ===");
        testClickable(myBallpen);

    }
    public static void testPen(Pen pen) {
        System.out.println(pen);
        pen.write();
        pen.store();
    }

    public static void testRefillable(Refillable refillable) {
        refillable.refill();
        System.out.println("Maximum refills: " + Refillable.MAX_REFILLS);
    }

    public static void testClickable(Clickable clickable) {
        clickable.click();
    }
}

/*
 * Part 5: Takeaway
 * Abstract classes (extends) are used to share a common base of data (fields) and behaviors
 * among related classes, but restrict direct instantiation.
 * Interfaces (implements) act as behavioral contracts, allowing unrelated classes to guarantee
 * they can perform a specific action (like clicking), and a class can implement multiple interfaces.
 */