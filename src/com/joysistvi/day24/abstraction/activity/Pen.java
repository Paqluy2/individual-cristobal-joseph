package com.joysistvi.day24.abstraction.activity;

public abstract class Pen {
    private String brand;
    private String color;
    private double weight;

    public Pen(String brand, String color, double weight) {
        this.brand = brand;
        this.color = color;
        this.weight = weight;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void write();

    public void store() {
        System.out.println("Storing the pen in the pencil case.");
    }

    public void write(String text) {
        System.out.println("Writing \"" + text + "\" with a pen.");
    }

    public void write(String text, int times) {
        for (int i = 0; i < times; i++) {
            write(text);
        }
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\n" +
                "Color: " + this.color + "\n" +
                "Weight in Grams: " + this.weight;
    }
}
