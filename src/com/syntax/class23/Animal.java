package com.syntax.class23;

public class Animal {
    Animal(){
        System.out.println("parent");
    }
    void eat(){
        System.out.println("All the animals eat");
    }

}
class Panda extends Animal{
    // no other class can inherit from Animal class because it is declared final

    @Override
    void eat() {
        System.out.println("All the animals eat");
    }
    Panda(){
        System.out.println("child");
    }
}
class TesterAnimal{
    public static void main(String[] args) {
        new Panda();
    }
}
