package com.syntax.class15;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Batch 13");

        int[] arr={10,20,30,40,50};
        ArrayUtils arrayUtils = new ArrayUtils();
        arrayUtils.printArray(arr);
        int sum = arrayUtils.sumArray(arr);
        System.out.println(sum);
    }
}
