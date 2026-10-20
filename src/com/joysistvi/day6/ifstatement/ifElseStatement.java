package com.joysistvi.day6.ifstatement;

public class ifElseStatement {

    public static void main(String[] args) {
        //Program that identifise  if age is valid or invalid
        int age = 17;

        //String result = (age >= 18) ? "Valid Age" : "Invalid Age";
        //System.out.println(result);

        String result = "";

        if (age >= 18){
            // if block
            result = "Valid Age";
        } else {
            result = "Invalid Age";
        }

        System.out.println(age + " is " + result);
    }
}
