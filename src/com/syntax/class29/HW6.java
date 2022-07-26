package com.syntax.class29;

import java.util.*;

public class HW6 {
    /*
    Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator.
     */
    public static void main(String[] args) {
        TreeMap<String, String> mapOfCountries = new TreeMap<>();
        mapOfCountries.put("Kazakhstan", "Astana");
        mapOfCountries.put("Turkiye","Ankara");
        mapOfCountries.put("Germany", "Berlin");
        mapOfCountries.put("Netherlands", "Amsterdam");
        mapOfCountries.put("Scotland", "Edinburgh");
        //mapOfCountries.entrySet() => a set of Entry objects
        //Entry objects has a method get key to get the key and another method to get the value
        for (Map.Entry<String, String> entry : mapOfCountries.entrySet()) {
            System.out.println("entry key = "+entry.getKey()+" entry value = "+entry.getValue());
        }
        System.out.println("================================");

        //mapOfCountries.entrySet() => a set of Entry objects
        //entrySet().iterator() => once we have the set we can get an iterator on that set
        Iterator<Map.Entry<String, String>> iterator = mapOfCountries.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entries = iterator.next();
            System.out.println("entry.getKey() = "+entries.getKey()+" value = "+entries.getValue());
        }
        System.out.println("================================");

        Collection<String> values = mapOfCountries.values();
        for (String capitals : values) {
            System.out.println("Capitals = "+capitals);
        }
        System.out.println("================================");

        Iterator<String> iterator1 = mapOfCountries.values().iterator();
        while(iterator1.hasNext()){
            System.out.println("Capitals = "+iterator1.next());
        }


    }
}
