package com.joysistvi.day22.activity;

public class Pen {
    private String brand;
    private String color;
    private double weight;

    public Pen(String brand, String color, double weightInGrams) {
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

    public void write()
    {
        System.out.println("Writing with a pen.");
    }


    public void refill() {
        System.out.println("Refilling the pen.");
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
