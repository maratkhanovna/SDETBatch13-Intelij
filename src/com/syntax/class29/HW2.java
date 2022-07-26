package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
Create a Set collection in which you need to add names of the countries.
In this set we want all objects to be sorted in alphabetical order.
Using 2 different ways retrieve all elements from set.
 */
public class HW2 {
    public static void main(String[] args) {
        TreeSet <String> countries = new TreeSet();
        countries.add("Kazakhstan");
        countries.add("Malaysia");
        countries.add("Italy");
        countries.add("New Zealand");
        countries.add("Switzerland");
        countries.add("Iceland");

        System.out.println(countries);

        Iterator<String> iterator = countries.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
