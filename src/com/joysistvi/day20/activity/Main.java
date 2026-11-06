package com.joysistvi.day20.activity;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserAccount user = new UserAccount();

        System.out.println("*************************************************");
        System.out.println("*          User Account Registration            *");
        System.out.println("*************************************************\n");

        System.out.print("Enter First Name: ");
        user.setFirstName(scanner.nextLine());

        System.out.print("Enter Middle Name: ");
        user.setMiddleName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        user.setLastName(scanner.nextLine());

        System.out.print("Enter Address: ");
        user.setAddress(scanner.nextLine());

        System.out.print("Enter Email: ");
        user.setEmail(scanner.nextLine());

        String password;
        String confirmPassword;

        while (true) {
            System.out.print("Enter Password: ");
            password = scanner.nextLine();

            System.out.print("Confirm Password: ");
            confirmPassword = scanner.nextLine();

            if (password.equals(confirmPassword)) {
                user.setPassword(password);
                break;
            } else {
                System.out.println("Passwords do not match! Please try again.\n");
            }
        }

        System.out.println("\n--- User Account Created ---");
        System.out.println("Full Name: " + user.getFirstName() + " " + user.getMiddleName() + " " + user.getLastName());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Email: " + user.getEmail());

        scanner.close();
    }
}
