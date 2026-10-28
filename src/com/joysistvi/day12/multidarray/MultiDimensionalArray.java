package com.joysistvi.day12.multidarray;

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // coordinates: rows & columns
        int[][] numbers = {
                //0 1 2
                {1, 2, 3, 4, 5}, // 0
                {4, 5, 6}, // 1
                {7, 8, 9}  // 2
        };
      //int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        //                     [row][column]
        //System.out.println(numbers[0].length);

        System.out.println("Traversing a multi-dimensional array using nested for loop");
        //                   0  <  3
        for (int rows = 0; rows < numbers.length; rows++){
            //                      0   <
            for (int column = 0; column < numbers[rows].length; column++) {
                System.out.println(numbers[rows][column]);
            }
            System.out.println();
        }
        System.out.println("\nTraversing a multi-dimensional array using nested using nested for-each loop");
        for (int[] rows: numbers) {
            for (int column: rows) {
                System.out.println(column);
            }
        }
        // Declare a multidimensional array with a specified size only
        String[][] planets = new String[2][5];

        for (int rows = 0; rows < planets.length; rows++) {
            for(int column = 0; column < planets[rows].length; column++) {
                System.out.print("Enter Planet: [" + (rows + 1) + "][" + (column + 1) + "]: " );
                planets[rows][column] = scanner.nextLine();
            }
            System.out.println();
        }
        for (String[] rows : planets) {
            System.out.print("[ ");
            for (String column : rows) {
                System.out.print(column + " ");
            }
            System.out.println("] ");
        }
    }
}
