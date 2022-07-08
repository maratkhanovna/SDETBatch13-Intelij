package com.syntax.class16;

public class Dog {
    static String name;
    String color;

    public static void main(String[] args) {
        Dog dog1 = new Dog(); //creating an object of Dog class
        dog1.name="Tomy";
        dog1.color = "pink";

        Dog dog2 = new Dog();
        dog2.name = "Fido";
        dog2.color = "black";

        Dog dog3 = new Dog();
        dog3.name = "Jaja";
        dog3.color = "white";

        System.out.println(dog1.name);
        System.out.println(dog2.name);
        System.out.println(dog3.name);
    }
}
