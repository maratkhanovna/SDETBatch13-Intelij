package com.syntax.class28;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        LinkedHashSet<String> fruit = new LinkedHashSet<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Orange");
        System.out.println(fruit);
        //we will see the Orange and Kiwi only once, because LinkedHashSet does not allow duplicates, it's ignoring the second one
        //order is maintained
    }
}
