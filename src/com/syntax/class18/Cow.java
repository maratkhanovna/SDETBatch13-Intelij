package com.syntax.class18;

public class Cow {
    String breed;
    String color;
    int age;
    double weight;
    Cow (String breed, String color, int age, double weight){
        //when we have same name variables as local and as instance inside a class
        //always local variables are preferred over instance variables by java in block of code
        //means breed was assigned to itself
        //to avoid it always use keyword "this." or create different name variable
        //this. will assign to instance variable not local
        this.breed=breed;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    String getCowInfo() {
        return "Breed "+breed+" Color "+color+" Age "+age+" Weight "+weight;
    }
}
