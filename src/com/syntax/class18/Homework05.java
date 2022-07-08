package com.syntax.class18;

public class Homework05 {
    /*Write a java class that have 4 constructors
    with 4 different access levels of constructors(private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class;
    2 - from outside the class;
    3 - from different class inside different package  and observe result.
     */
    private Homework05(){
        System.out.println("private");
    }
    Homework05(String name){
        System.out.println("default");
    }
    protected Homework05(int num){
        System.out.println("protected");
    }
    public Homework05(boolean flag){
        System.out.println("public");
    }

    public static void main(String[] args) {
        new Homework05();
        new Homework05("World");
        new Homework05(15);
        new Homework05(true);
    }
}
