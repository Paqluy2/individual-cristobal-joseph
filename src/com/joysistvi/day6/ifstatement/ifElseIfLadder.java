package com.joysistvi.day6.ifstatement;

public class ifElseIfLadder {

    public static void main(String[] args) {
    /*
        int day = -1;
        String dayName;

        if (day == 1) {
            // Executes when day is 1
            dayName = "Sunday";
        } else if (day == 2) {
            // Executes when day is 2
            dayName = "Monday";
        } else if (day == 3) {
            // Executes when day is 3
            dayName = "Tuesday";
        } else if (day == 4) {
            // Executes when day is 4
            dayName = "Wednesday";
        } else if (day == 5) {
            // Executes when day is 5
            dayName = "Thursday";
        } else if (day == 6) {
            // Executes when day is 6
            dayName = "Friday";
        } else if (day == 7) {
            // Executes when day is 7
            dayName = "Saturday";
        } else {
            // Executes when the day number is invalid
            dayName = "Invalid Day";
        }

        System.out.println(dayName);
    */
        // Nested If Statement
        int grade = 1000;
        String result;
    /*
        if (grade >= 1 && grade <= 100){

            if (grade <= 70) {
                result = "F";
            } else if (grade <= 80) {
                result = "C";
            } else if (grade <=90){
                result = "B";
            } else if (grade >= 100) {
                result = "A";
            }else {
                result = "Invalid Grade";
            }
            System.out.println(grade);
            System.out.println(result);
        } else {
            System.out.println("Invalid Grade");

    }

     */
        // early exit
        if (!(grade >= 1 && grade <= 100)) {
            return; // terminate method
        }

        if (grade <= 70) { // 1 - 70
            result = "F";
        } else if (grade <= 80) { // 71 - 80
            result = "C";
        } else if (grade <= 90) {
            result = "B";
        } else if (grade <= 100){
            result = "A";
        } else {
            result = "Invalid Grade";
        }

        System.out.println("Grade: " + grade);
        System.out.println("Classification: " + result);


 }
}