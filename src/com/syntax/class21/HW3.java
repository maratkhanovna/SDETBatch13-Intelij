package com.syntax.class21;

public class HW3 {
    static void sayHello(){
        System.out.println("Hello Batch 13");
    }
    static void sayHello(String msg){
        System.out.println(msg);
    }
    static void sayHello(String msg, int times){
        for (int i=0; i<times; i++) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        sayHello();
        sayHello("batch 13 the best");
        sayHello("Learn java", 3);
    }
}
