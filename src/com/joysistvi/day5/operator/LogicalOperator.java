package com.joysistvi.day5.operator;

public class LogicalOperator {

    public static void main(String[] args) {

        int num = 18;
        int num2 = 20;

        // && - Both statement must be True to be True
        System.out.println(num > num2 && num < num2);

        // || - Either 1 must be True
        System.out.println(num > num2 || num < num2);

        // compound Conditional Statement
        int age = 15;

        boolean usJuniorHigh = age >= 13 && age <= 17;
        System.out.println(usJuniorHigh);
    }
}
