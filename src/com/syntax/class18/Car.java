package com.syntax.class18;

public class Car {
    String make;
    String model;
    String color;

    public Car (String carMake, String carModel, String carColor) {
        make=carMake;
        model=carModel;
        color=carColor;
    }
    public Car (String carModel){
        model=carModel;
    }

    //public Car (String carModel){
    //        model=carModel;
    //    } //it is not allowed to have two constructors in a class
    //    with the same number of parameters and same type

    void printCarModel(){
        System.out.println("Model "+model);
    }
    void printInfo(){
        System.out.println("Make "+make+" Model "+model+" Color "+color);
    }

}
