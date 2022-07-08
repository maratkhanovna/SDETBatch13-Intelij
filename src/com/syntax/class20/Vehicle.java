package com.syntax.class20;

public class Vehicle { //multilevel inheritance
    int  engineHP;
    String make;
    String model;
    String color;
}
class Car extends Vehicle{ //intermediary class
    String steeringType;
    boolean autoPilot;
    int noOfWindows;
}
class BMW extends Car{
    int topSpeed;
    void printBasicInfo(){

    }
}
