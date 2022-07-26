package com.syntax.class29;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class HW11 {
    //Create a collection of integers in which you can keep duplicates.
    //Write a logic to find sum of all integers
    public static void main(String[] args) {
       /* ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(10);
        integers.add(10);
        integers.add(10);
        integers.add(10);
        integers.add(10);
        integers.add(10);
        integers.add(10);
        integers.add(10);
        */

        List<Integer> integers = Arrays.asList(10,20,30,40,50,60,70,80);
        //preferred only for immutable where you will not add values or change the size

        int sum=0;

        for (Integer nums : integers) {
            sum+=nums;
        }
        System.out.println(sum);

    }
}
