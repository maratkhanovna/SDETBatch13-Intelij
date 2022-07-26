package com.syntax.class29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HW1 {
    public static void main(String[] args) {
        //How can you remove all duplicates from ArrayList?
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        HashSet <String> sSet = new HashSet<>(aList);
        System.out.println(sSet);

    }
}
