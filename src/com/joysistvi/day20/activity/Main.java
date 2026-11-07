package com.joysistvi.day20.activity;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*************************************************");
        System.out.println("*          User Account Registration            *");
        System.out.println("*************************************************\n");

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        String email;
        while (true) {
            System.out.print("Enter email: ");
            email = scanner.nextLine();

            if (email.contains("@") && email.contains(".")) {
                break; // Valid format, exit the loop
            } else {
                System.out.println("Invalid email format! Must contain '@' and '.'. Please try again.\n");
            }
        }

        String password;
        String confirmPassword;

        while (true) {
            System.out.print("Enter Password: ");
            password = scanner.nextLine();


            boolean hasNumber = false;
            for (char c : password.toCharArray()) {
                if (Character.isDigit(c)) {
                    hasNumber = true;
                    break;
                }
            }


            if (password.length() >= 8 && hasNumber) {

                System.out.print("Confirm Password: ");
                confirmPassword = scanner.nextLine();

                if (password.equals(confirmPassword)) {
                    break;
                } else {
                    System.out.println("Passwords do not match! Please try again.\n");
                }

            } else {
                System.out.println("Invalid password! Password must be at least 8 characters long and contain a number.\n");
            }

        }

        System.out.println();


        UserAccount account = new UserAccount(firstName, middleName, lastName, address, email, password);


        System.out.println(account);

        scanner.close();
    }
}
