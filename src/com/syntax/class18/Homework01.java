package com.syntax.class18;

import org.jetbrains.annotations.NotNull;

public class Homework01 {
    /*1. Create a method that will accept an array as parameters
     and will return a sum of all elements from that array.
     Method should be visibly only within same package and accessible by the creating an instance of the class.
     2. Create a method that will take a String as a parameter and returns reversed String.
     Method should be available to all classes within your project and accessible by class name.
     3.Create a method that will accept a String as a parameter
     and return a new String that consist only of vowels.
     Method should be available inside the class only where it was declared and executed by calling it is name.
     */

    int sum=0;

    int getSum(int []arr){
        for (int nums:arr) {
           sum+=nums;
        }
        return sum;
    }
    public static String getReversed(String str){
        return new StringBuilder(str).reverse().toString();
    }
    private static String getNew(String str){
        return str.replaceAll("[^aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        Homework01 hm01 = new Homework01();
        System.out.println(hm01.getSum(new int[]{5,10,5,10}));
        System.out.println(Homework01.getReversed("abra"));
        System.out.println(getNew("Homework"));
    }


}
