package com.joysistvi.day25.collectionsframework;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoManager {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            showMenu();
            int choice = getInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    updateTask();
                    break;
                case 4:
                    removeTask();
                    break;
                case 5:
                    clearTasks();
                    break;
                case 0:
                    System.out.println("Exiting TodoManager. Goodbye!");
                    running = false; // Breaks the loop
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // 4. Menu System
    public static void showMenu() {
        System.out.println("\n--- Todo Manager Menu ---");
        System.out.println("1. Add a task");
        System.out.println("2. View all tasks");
        System.out.println("3. Update a task");
        System.out.println("4. Remove a task");
        System.out.println("5. Clear all tasks");
        System.out.println("0. Exit");
    }

    // 3. Helper Method (Provided)
    public static int getInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a number.");
            }
        }
    }

    // 5. Create a Method for Each Option

    public static void addTask() {
        System.out.print("Enter task to add: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    public static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
        } else {
            System.out.println("\n--- Your Tasks ---");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void updateTask() {
        int taskNum = getInput("Enter task number to update: ");

        // Validate that the number corresponds to an existing index
        if (taskNum > 0 && taskNum <= tasks.size()) {
            System.out.print("Enter the new task: ");
            String newTask = scanner.nextLine();
            tasks.set(taskNum - 1, newTask); // Subtract 1 to match array index
            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public static void removeTask() {
        int taskNum = getInput("Enter task number to remove: ");

        if (taskNum > 0 && taskNum <= tasks.size()) {
            tasks.remove(taskNum - 1);
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public static void clearTasks() {
        tasks.clear();
        System.out.println("All tasks cleared.");
    }

}
