package com.joysistvi.day13.string;

public class Activity10_Cristobal {

    public static void main(String[] args) {

        String text = "Joysis TECH VOC INC.";

        System.out.println("contains()");
        System.out.println(text.contains("Joysis"));

        System.out.println("\nendsWith()");
        System.out.println(text.endsWith("VOC INC."));

        System.out.println("\nstartsWith()");
        System.out.println(text.startsWith("Joysis"));

        System.out.println("\nindexOf()");
        System.out.println(text.indexOf("I"));

        System.out.println("\ntrim()");
        System.out.println(text.trim());

        System.out.println("\nreplace()");
        System.out.println(text.replace("Joysis" , "Sadsis"));

        char[] letters = text.toCharArray();
        System.out.println("\ntoCharArray()");
        for (int i = 0; i < letters.length; i++) {
            System.out.println("Index" + i + ": " + letters[i]);
            if (i == 5) {
                break;
            }
        }

        String country = "Philippines";

        char firstChar = country.charAt(0);
        char lastChar = country.charAt(10);

        System.out.println("String: " + country);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);

        int letterCount = 0;
        int vowelCount = 0;

        char[] letter = country.toCharArray();

        for (int i = 0; i < letter.length; i++) {
            char current = letter[i];

            if (current == 'P' || current == 'p') {
                letterCount++;
            }

            if (current == 'A' || current == 'a' ||
                    current == 'E' || current == 'e' ||
                    current == 'I' || current == 'i' ||
                    current == 'O' || current == 'o' ||
                    current == 'U' || current == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Occurrences of 'P' or 'p': " + letterCount);
        System.out.println("Total number of vowels: " + vowelCount);



    }
}
