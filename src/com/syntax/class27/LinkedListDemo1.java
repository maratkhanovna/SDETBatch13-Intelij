package com.syntax.class27;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Jennifer");
        names.add("George");
        names.add("Gisel");
        names.add("Abdul");
        System.out.println(names.size());


        List<Integer> fibonacci = new LinkedList<>();
        int first = 0;
        int second = 1;

        for (int i=0; i<10; i++) {
            fibonacci.add(first);
            int next = first+second;
            first=second;
            second=next;
            System.out.print(fibonacci.get(i)+" ");
        }
    }
}
