package com.joysistvi.day22.activity;

public class Marker extends Pen {
    private boolean permanent;


    public Marker(String brand, String color, double weightInGrams, boolean permanent) {
        super(brand, color, weightInGrams);
        this.permanent = permanent;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    @Override
    public void write() {
        System.out.println("Writing boldly with a marker.");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the marker ink.");
    }

    @Override
    public String toString() {
        String isPerm = this.permanent ? "Yes" : "No";
        return "Type: Marker\n" + super.toString() + "\nPermanent: " + isPerm;
    }
}
