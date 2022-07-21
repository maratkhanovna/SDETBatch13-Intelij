package com.syntax.class29;

import java.util.*;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit = new HashMap<>();
        fruit.put("Apple", 2000.0); //auto upcasting does not work with wrappers
        fruit.put("Orange", 20.5);
        fruit.put("Kiwi", 10.2);
        fruit.put("Banana", 50.5);
        fruit.put("Peach", 10.5);
        Set<String> keys = fruit.keySet();//all the keys from a Map in the form of a Set
        for (String Key:keys) {
            System.out.println("Key = " + Key);
        }
        Collection<Double> values= fruit.values();//returns all the values in the form of the collection
        for (Double value : values) {
            System.out.println("value = " + value);
        }
    }
}
