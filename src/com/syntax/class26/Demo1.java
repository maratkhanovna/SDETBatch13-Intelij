package com.syntax.class26;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        String name = "Aladdin";
        String name2 = "Asghar";
        String name3 = "Ahmed";
        String [] names = {"Aladdin", "Asghar", "Ahmed"};
        System.out.println(names.length);
        names=new String[4];
        names[0]="Aladdin";
        names[1]="Asghar";
        names[2]="Ahmed";
        names[3]="Reza";
        System.out.println(names.length);
        ArrayList<String>syntaxStudents=new ArrayList<>();
        System.out.println(syntaxStudents.size());
        syntaxStudents.add("Riaz");
        System.out.println(syntaxStudents.size());
        syntaxStudents.add("Karla");
        syntaxStudents.add("Ivan");
        System.out.println(syntaxStudents.size());

        ArrayList<Integer>odd=new ArrayList<>();
        for (int i=0; i<10;i++) {
            if (i % 2 != 0) {
                odd.add(i);
            }
        }
        System.out.println(odd);

    }
}
