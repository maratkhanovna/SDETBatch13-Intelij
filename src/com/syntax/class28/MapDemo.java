package com.syntax.class28;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> groceries = new HashMap<>();
        groceries.put("Eggs", 12); //adds the key value pairs to map
        groceries.put("Milk",3);
        groceries.put("Apple",3);
        groceries.put("Fish",25);
        groceries.put("Fish",50);// no duplicates allowed, map is override the first element and will show us the second

        System.out.println(groceries);
        System.out.println(groceries.get("Milk"));//3
        System.out.println(groceries.get("Fish"));//25
    }
}
