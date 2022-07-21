package com.syntax.class26;

import java.util.ArrayList;

public class HW3 {
    //Create an arrayList of words. Remove every word that ends with “e”.
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Terminal");
        words.add("Service");
        words.add("Version");
        words.removeIf(s -> s.endsWith("e"));
        System.out.println("words = " + words);
    }
}
