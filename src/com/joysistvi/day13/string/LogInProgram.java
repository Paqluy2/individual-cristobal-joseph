package com.joysistvi.day13.string;

import java.util.Scanner;

public class LogInProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String correctUsername = "admin";
        String correctPassword = "password123";

        int maxAttempts = 5;
        boolean loginSuccessful = false;

        System.out.println("--- System Login ---");

        // Loop runs up to 5 times
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            // Check if both username and password match using .equals()
            if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
                System.out.println("\nLogin successful! Welcome back.");
                loginSuccessful = true;
                break; // Exits the loop immediately upon success
            } else {
                int attemptsLeft = maxAttempts - attempt;

                if (attemptsLeft > 0) {
                    System.out.println("Incorrect credentials. You have " + attemptsLeft + " attempts remaining.\n");
                } else {
                    System.out.println("\nMaximum login attempts reached. System locked.");
                }
            }
        }

        scanner.close();
    }
}
