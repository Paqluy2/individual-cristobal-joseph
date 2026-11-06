package com.joysistvi.day20.encapsulation;

public class Ballpen {

    // data hiding - making all the data private
    private String brand;
    private String color;
    private double pointSize;
    private double weightInGrams;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public  void setPointSize(double pointSize){
        this.pointSize = pointSize;
    }
}
