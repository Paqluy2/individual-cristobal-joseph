package com.joysistvi.day5.operator;

public class Activity3_Cristobal{
    public static void main(String[] args) {

        //logical AND operator (&&)
        int age = 19;
        boolean hasValidID = true;

        String status = (age >= 18 && hasValidID) ? "Yes" : "No";
        System.out.println("Allowed to enter the event: " + status);


        //logical OR operator (||
        boolean isWeekend = false;
        boolean isHoliday = true;

        String classStatus = (isWeekend || isHoliday ) ? "Yes, no classes." : "No, there's classes.";
        System.out.println("Are there no classes today? " +classStatus);

        //ternary operator Pass or Fail check

        int score = 79;

        String result = (score >= 75) ? "Passed" : "Failed";
        System.out.println("Result: " + result);

        //ternary operator Larger Number Check

        int num = 67;
        int num2 = 69;

        int largerNum = (num > num2) ? num : num2;
        System.out.println("Number 1: " + num + ", Number 2: " + num2);
        System.out.println("The larger number is: " + largerNum);



    }
}
