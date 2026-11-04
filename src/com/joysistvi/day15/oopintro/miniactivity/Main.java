package com.joysistvi.day15.oopintro.miniactivity;

public class Main {
    public static void main(String[] args) {

        Calendar calendar = new Calendar();
        calendar.brand = "Mercury drug";
        calendar.type = "Wall";
        calendar.color = "White, Blue";
        calendar.year = 2024;
        calendar.isLeapYear = true;

        calendar.checkDate();
        calendar.flipPage();

        Calendar calendar2 = new Calendar();
        calendar2.brand = "Google Calendar";
        calendar2.type = "Digital";
        calendar2.color = "White";
        calendar2.year = 2026;
        calendar2.isLeapYear = false;

        calendar2.addEvent();
        calendar2.setReminder();

    }
}
