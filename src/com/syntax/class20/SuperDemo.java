package com.syntax.class20;

public class SuperDemo {
    public static void main(String[] args) {
        Chair chair  = new Chair();
        chair.printColor();
    }
}
class Wood{
    String color = "Blue";
}
class Furniture extends Wood{
    String color="Black";
}
class Chair extends Furniture{
    String color="grey";
    void printColor(){
        String color="White";
        System.out.println(color); //will print white color because local variable is always preferred
        System.out.println(this.color); //prints instance variable grey
        System.out.println(super.color); //prints color of furniture class field(immediate/nearest parent), and we will never access Blue color of grandparent class
    }
}
