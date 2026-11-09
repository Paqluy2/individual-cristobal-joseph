package com.joysistvi.day22.Inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", 3);
        Cat cat = new Cat("Tisoy", 3, "White");
        Dog dog = new Dog("Sophie", 3, "Aspin");

        System.out.println("=== Animal===");
        System.out.println(animal);
        animal.eat();
        animal.makeSound();

        System.out.println("\n=== Dog ===");
        System.out.println(dog);
        dog.eat();
        dog.makeSound();
        dog.fetch();

        System.out.println("\n === Cat ===");
        System.out.println(cat);
        cat.eat();
        cat.makeSound();
        cat.scratch();


    }
}
