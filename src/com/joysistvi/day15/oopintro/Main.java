package com.joysistvi.day15.oopintro;

public class Main {
    public static void main(String[] args) {
        // Class Instantiation / create an object
        Laptop laptop = new Laptop();
        laptop.brand = "Levovo";
        laptop.color = "Blue";
        laptop.weightInkg = 2.5;
        laptop.cpu = "i5";
        laptop.ramInGb = 16;

        laptop.browseInternet();
        laptop.createDocument();
        laptop.sendMessages();
        laptop.transferFiles();

        Laptop laptop2 = new Laptop();
        laptop2.brand = "HP";
        laptop2.color = "Black";
        laptop2.weightInkg = 1.5;
        laptop2.cpu = "i7";
        laptop2.ramInGb = 16;

        laptop2.createDocument();
        laptop2.sendMessages();
        laptop2.transferFiles();

        Laptop laptop3 = new Laptop();
        laptop3.brand = "MSI";
        laptop3.color = "Red";
        laptop3.weightInkg = 1.5;
        laptop3.cpu = "i9";
        laptop3.ramInGb = 32;

        laptop3.createDocument();
        laptop3.sendMessages();
        laptop3.transferFiles();

    }
}
