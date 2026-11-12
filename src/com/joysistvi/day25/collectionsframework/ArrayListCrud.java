package com.joysistvi.day25.collectionsframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCrud {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Pink");
        colors.add(1, "White");

        //System.out.println(colors);

        // Read / Get items
        System.out.println(colors.get(0));
    }
}
