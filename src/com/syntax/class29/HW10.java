package com.syntax.class29;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HW10 {
    /*
    Create the collection that will store single uniques Objects of a String type in which order is preserved.
    Write a logic to concatenate all string from the collection.
     */
    public static void main(String[] args) {
        LinkedHashSet<String> collection = new LinkedHashSet<>();
        collection.add("Hello");
        collection.add("World");
        collection.add("Welcome");
        collection.add("to");
        collection.add("Syntax");
        StringBuilder concat= new StringBuilder();

        for (String s : collection) {
            concat.append(s).append(" ");
        }
        System.out.println(concat);




    }
}
