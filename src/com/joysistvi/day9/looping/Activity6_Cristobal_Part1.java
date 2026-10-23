package com.joysistvi.day9.looping;

import java.util.Scanner;

public class Activity6_Cristobal_Part1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the multiplication table you want to display: ");
        int num = scanner.nextInt();

        System.out.println("Multiplication Table of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
