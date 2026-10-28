package com.joysistvi.day12.multidarray;

import java.util.Scanner;

public class Activity9_Cristobal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------------------------");
        System.out.println("                   Average Calculator                       ");
        System.out.println("------------------------------------------------------------");

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine();

        String[] subjects = new String[numSubjects];

        System.out.println("\nEnter subject names:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextLine();
        }


        String[] studentNames = new String[numStudents];
        int[][] grades = new int[numStudents][numSubjects];
        double[] averages = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("\nEnter name for student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            double totalGrade = 0;

            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter grade for " + subjects[j] + ": ");
                grades[i][j] = scanner.nextInt();
                totalGrade += grades[i][j];
            }

            averages[i] = totalGrade / numSubjects;
            scanner.nextLine();
        }


        System.out.println("\n------------------------------------------------------------");
        System.out.println("                        GRADES REPORT                       ");
        System.out.println("------------------------------------------------------------");


        System.out.printf("%-25s", "Student Name");
        for (int i = 0; i < numSubjects; i++) {
            System.out.printf("%-15s", subjects[i]);
        }
        System.out.printf("%-10s%n", "Average");
        System.out.println("------------------------------------------------------------");


        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-25s", studentNames[i]);

            for (int j = 0; j < numSubjects; j++) {
                System.out.printf("%-15d", grades[i][j]);
            }

            System.out.printf("%-10.2f%n", averages[i]);
        }
        scanner.close();
    }
}
