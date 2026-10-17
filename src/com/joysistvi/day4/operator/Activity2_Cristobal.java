package com.joysistvi.day4.operator;

public class Activity2_Cristobal {

    public static void main(String[] args) {
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        double foodAllowancePercentage = (foodAllowance / income) * 100;
        double transportationPercentage = (transportation / income) * 100;
        double rentPercentage = (rent / income) * 100;
        double utilityBillPercentage = (utilityBill / income) * 100;
        double remainingBalance = income - (foodAllowance + transportation + rent + utilityBill);


        System.out.println("*Expense Tracker Program*");
        System.out.println("Income: " + income);
        System.out.printf("Food Allowance: %.1f %%%n", foodAllowancePercentage);
        System.out.printf("Transportation: %.1f %%%n", transportationPercentage);
        System.out.printf("Rent: %.1f %%%n", rentPercentage);
        System.out.printf("Utility Bill: %.1f %%%n", utilityBillPercentage);
        System.out.println("Remaining Balance: " + remainingBalance);
    }
}
