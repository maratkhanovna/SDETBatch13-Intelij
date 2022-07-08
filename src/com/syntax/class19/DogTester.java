package com.syntax.class19;

public class DogTester {
    public static void main(String[] args) {
        Cat cat=new Cat("kitty", "white");
        cat.printInfo(); // Cat does not have this method but because we can use the methods from the parent class
        Dog dog=new Dog("Max", "brown");
        dog.printInfo();
    }
}
