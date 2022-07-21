package com.syntax.class26;

import java.util.ArrayList;
import java.util.Iterator;

public class HW5 {
    //Create an arrayList of even numbers from 1 to 500.
    // Remove any number that is divisible by 5 from that arrayList.
    public static void main(String[] args) {
        ArrayList<Integer> even = new ArrayList<>();
        for (int i=2; i<=500; i=i+2){
            even.add(i);
        }
        System.out.println("even = " + even);

        Iterator<Integer> iterator = even.iterator();
        while (iterator.hasNext()){
            if(iterator.next()%5==0){
                iterator.remove();
            }
        }
        /*
        for (int i=0; i< even.size(); i++){
            if (even.get(i)%5==0) {
                even.remove(i);
            }
        }*/
        System.out.println("even = " + even);
    }
}
