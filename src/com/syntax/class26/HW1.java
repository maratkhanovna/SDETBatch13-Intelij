package com.syntax.class26;

import java.util.ArrayList;

public class HW1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(5);
        //always good to specify initial capacity it improves the performance
        //default capacity is 10
        names.add("Bika");
        names.add("Dina");
        names.add("Alina");
        names.add("Adil");
        names.add("Gaukhar");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Asel"));
        System.out.println("Size of ArrayList is "+names.size()+"; names = " + names);
    }
}
