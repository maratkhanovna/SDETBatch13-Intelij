package com.syntax.repls;

public class Repl145 {
    public static void main(String[] args) {
        Dog obj1=new Dog("Tarzan", 50);
        Dog obj2=new Dog("Lucy", 10);

        System.out.println(obj1);
        System.out.println(obj2);

    }
}
class Dog{
    String dogName;
    double dogWeight;
    static String dogBreed="Mutt";
    Dog(String dogName, double dogWeight){
        this.dogName=dogName;
        this.dogWeight=dogWeight;
    }
}
