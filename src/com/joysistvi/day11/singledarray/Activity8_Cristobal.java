package com.joysistvi.day11.singledarray;

import java.util.Scanner;

public class Activity8_Cristobal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;
        int average = 0;

        System.out.println("Enter 5 numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers [i] = sc.nextInt();
        }
        System.out.println("\nYou Entered: ");
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            average = sum / numbers.length;
            System.out.println("Index " + (i + 1) + ": " + numbers[i]);
        }

        System.out.println("\nsum = " + sum);
        System.out.println("average = " + average);
        System.exit(0);


    }
}
