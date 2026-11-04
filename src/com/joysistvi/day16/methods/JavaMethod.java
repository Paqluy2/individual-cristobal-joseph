package com.joysistvi.day16.methods;

public class JavaMethod {

    public static void main(String[] args) {
        int year = 2026;
        if (year == 2026) {
            greet("Joseph", 19);
        } else if ( year == 2027) {
            greet("Joseph", 20);
        }


    }

    public static void greet(String name, int age) {
        print("Hello, my name is " + name);
        System.out.println("I am " + age + " years old.");
    }

    public static void print(String word) {
        System.out.println(word);
    }
}

/*
    public static void main(String[] args) {
        System.out.println(sum(15, 55));

    }

    public static int sum(int a, int b) {
        return a + b;

    }
 */