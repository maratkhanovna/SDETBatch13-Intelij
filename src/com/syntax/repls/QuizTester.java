package com.syntax.repls;

import java.util.ArrayList;

public class QuizTester {
    public static void main(String[]args){
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(111);
        obj.add(222);
        obj.add(333);
        obj.add(444);
        obj.add(555);
        obj.add(666);
        for (int i=0; i<obj.size();i++){
            if(i%2==0){
                System.out.println(obj.get(i));
            }
        }
        ArrayList<String> obj2 = new ArrayList<>();
        obj2.add("hi");
        obj2.add("yo");
        obj2.add("sup");
        obj2.add("yolo");
        obj2.add("boop");
        for (int i=0; i<=obj.size()-1; i++){
                obj2.remove(i);

            System.out.print(obj2.get(i)+" ");
        }


    }
}


