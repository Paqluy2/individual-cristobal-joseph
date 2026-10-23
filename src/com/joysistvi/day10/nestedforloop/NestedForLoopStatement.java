package com.joysistvi.day10.nestedforloop;

public class NestedForLoopStatement {
    public static void main(String[] args) {

             for (int i = 1; i <= 5; i++) {
                 System.out.println();
                 for (int j = 1; j <= i; j++) {
                     System.out.print("*");
                 }




        }


    }
}
/*
    for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++){

                System.out.println(i + " * " + j + " = " + (i * j));

            }
            System.out.println();
        }


         for (int i = 1; i <=5; i++){
          System.out.println(i);
          for (int j = 1; j <=i; j++) {
              System.out.println("\t" + j);
          }
      }

 */