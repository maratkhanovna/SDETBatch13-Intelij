package com.syntax.class18;

public class Homework06 {
    //// Write program that have static constructor and observe result.
    //static Homework06(){} -> Modifier 'static' not allowed here

    /* task8. Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.
     */
    String name;
    String address;
    Homework06(String name, String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {
        Homework06 homework06=new Homework06("Jose", "street1");
        homework06.displayInfo();
    }
}
