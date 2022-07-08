package com.syntax.reviewclass09;

import java.util.Objects;

public class Bicycle {
    String make;
    int gears;
    int maxSpeed;

    public Bicycle(String make, int gears, int maxSpeed) {
        this.make = make;
        this.gears = gears;
        this.maxSpeed = maxSpeed;
    }

    void ride(){
        System.out.println("It's time to ride Bicycles");
    }
    void applyBreaks(){
        System.out.println("Applying brakes");
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "make='" + make + '\'' +
                ", gears=" + gears +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bicycle)) return false;
        Bicycle bicycle = (Bicycle) o;
        return gears == bicycle.gears && maxSpeed == bicycle.maxSpeed && make.equals(bicycle.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, gears, maxSpeed);
    }
}
class MountainBikes extends Bicycle{
    boolean suspension=true;
    int seatHeight;

    public MountainBikes(String make, int gears, int maxSpeed, int seatHeight) {
        super(make, gears, maxSpeed);
        this.seatHeight=seatHeight;
    }

    void setSeatHeight(int seatHeight){
        this.seatHeight=seatHeight;
    }

}
class Test{
    public static void main(String[] args) {
        Bicycle bike = new Bicycle("TREK", 4, 30);
        Bicycle bike2 = new Bicycle("TREK", 4, 30);
        System.out.println(bike==bike2);//we should never use  == to compare non-primitive data types
        System.out.println(bike.equals(bike2));// we should override equals method
        System.out.println(bike);// we should override toString method
    }
}
