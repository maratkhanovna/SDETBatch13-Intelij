package com.syntax.reviewclass07;

public class B13StringTester {
    public static void main(String[] args) {
        B13String str= new B13String("abcsssesda");
        int count=str.countChars('s');
        System.out.println(count);
        str.printChars('a');
    }
}
