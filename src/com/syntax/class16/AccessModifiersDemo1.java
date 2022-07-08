package com.syntax.class16;

public class AccessModifiersDemo1 {
    private String password="pass123"; //this variable is only accessable in this class
    int ssn=123456; //this variable can be accessed in the same package
    public String name="Karla"; // everyone can access this variable

    public static void main(String[] args) {
        AccessModifiersDemo1 ac = new AccessModifiersDemo1();
        System.out.println(ac.password);
        System.out.println(ac.ssn);
        System.out.println(ac.name);
    }

}
