package com.joysistvi.day6.ifstatement;

public class Activity4_Cristobal {

    public static void main(String[] args) {

        int age = 19;
        String ageCat;
        /*
        Age: 0 - 2 → Baby
        Age: 3 - 12 → Child
        Age: 13 - 19 → Teenager
        Age: 20 - 29 → Young Adult
        Age: 30 - 59 → Adult
        Age: 60 - 100 → Senior

         */

        if (age >= 1 && age <=100) {

            if (age <= 2) {
                ageCat = "Baby";
            } else if (age <= 12) {
                ageCat = "Child";
            } else if (age <= 19) {
                ageCat = "Teenager";
            } else if (age <= 29) {
                ageCat = "Young Adult";
            } else if (age <= 59) {
                ageCat = "Adult";
            } else {
                ageCat = "Senior";
            }
            System.out.println("Age: " + age);
            System.out.println("Category: " + ageCat);
        } else {
            System.out.println("Invalid Age");
        }


    }
}
