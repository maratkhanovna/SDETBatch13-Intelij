package com.syntax.class26;

import java.util.ArrayList;

public class HW4 {
    //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("coke");

        for (int i=0; i< drinks.size(); i++){
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")){
                drinks.set(i, "water");
            }
        }
        System.out.println("drinks = " + drinks);
    }
}
