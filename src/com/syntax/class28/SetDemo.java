package com.syntax.class28;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> fruit = new HashSet<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Orange");
        System.out.println(fruit);
        //we will see the Orange fruit only once, because HashSet does not allow duplicates
        //order is not maintained it's randomly inserts the element
    }
}
