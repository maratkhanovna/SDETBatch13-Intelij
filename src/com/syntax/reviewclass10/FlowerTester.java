package com.syntax.reviewclass10;

public class FlowerTester {
    public static void main(String[] args) {
        Rose rose = new Rose("Red");
        rose.showColor();
        rose.bloom();
        rose.smell();
        rose.thorns(); //we can use specific method in this object that stored in child class that have this method inside


        System.out.println("******************************");
        Flower flower = new Rose("Green");
        flower.showColor();
        flower.bloom();
        flower.smell();
        Rose rose1 = (Rose)flower; //converting flower to rose
        rose1.thorns();
        //flower.thorns(); --> not possible
        //we can not use that because this object is stored in parent class

        Flower[] flowers = {new Rose("Red"), new Tulips("Pink")};
        for (Flower flower1 : flowers) {
            flower1.bloom();
            flower1.smell();
        }
        main("Katerina got confused");
    }

    public static void main(String args) {
        //we can overload main method
        System.out.println("Hehehe got confused");
    }
}
