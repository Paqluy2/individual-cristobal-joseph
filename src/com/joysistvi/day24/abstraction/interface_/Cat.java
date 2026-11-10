package com.joysistvi.day24.abstraction.interface_;


import com.joysistvi.day22.Inheritance.Animal;

// Child / Sub Class
public class Cat extends Animal implements Pet {

    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow meow.");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void scratch() {
        System.out.println(getName() + " is scrtching the sofa.");
    }

    @Override
    public String toString() {
        return "Type: Cat\n"
                + super.toString() + "\n"
                + "Fur color: " + furColor;
    }
    @Override
    public void play() {
        System.out.println(getName() + " chases a ball of yarn.");
    }

    @Override
    public void showAffection() {
        System.out.println(getName() + " purrs and rubs against you.");
    }
}
