package com.syntax.class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);

        //when we pass the list to the constructor of the Set and java will create a set out of that list
        //using the same approach we get a list back from the set
        //numbers = new ArrayList<>(new LinkedHashSet<>(numbers));//the fastest and better approach
        //convert List to the Set and get back new List
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();//creating a set
        linkedHashSet.addAll(numbers);//adding all elements from the list to Set
        numbers = new ArrayList<>(); //create a new Array
        numbers.addAll(linkedHashSet); //adding unique elements

        System.out.println(numbers);

    }
}
