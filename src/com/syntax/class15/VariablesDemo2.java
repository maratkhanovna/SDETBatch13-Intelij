package com.syntax.class15;

public class VariablesDemo2 {
    int num = 10; // whenever you share some info in more than 1 methods of a class use instance variables
    void method1() {
        int num2 = 20;
        System.out.println(num);
    }
    void method2() {
        //System.out.println(num2); will be an error because we cannot access local variable from method1
        System.out.println(num);
    }
}
