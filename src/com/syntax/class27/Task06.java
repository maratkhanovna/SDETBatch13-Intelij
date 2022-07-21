package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task06 {
        /*
        Create a class Insurance that will have an attribute as insuranceName and unimplemented
    behaviour as getQuote and cancelInsurance.
    Create 3 subclasses Car, Pet, Health.
    Car class has it's own attribute as carModel and Class Pet has petType attribute.
    Create 3 objects of the sub classes and store them in ArrayList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
         */
        public static void main(String[] args) {
            Car cars = new Car("AllState", "Tesla");
            Pet pets = new Pet("Geico", "Dog");
            Health health = new Health("MetroPlus");

            ArrayList<Insurance> insurances = new ArrayList<>();
            insurances.add(health);
            insurances.add(cars);
            insurances.add(pets);

            for (Insurance insurance : insurances) {
                insurance.getQuote();
                insurance.cancelInsurance();
            }

        }
}
abstract class Insurance{
    static String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    abstract void getQuote();
    abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println("To get a quote fill out the form and press submit");
    }

    @Override
    void cancelInsurance() {
        System.out.println("To cancel insurance submit the following form");
    }
}
class Pet extends Insurance{
    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println("To get a quote fill out the form and press submit");
    }

    @Override
    void cancelInsurance() {
        System.out.println("To cancel insurance submit the following form");
    }
}
class Health extends Insurance{

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("To get a quote fill out the form and press submit");
    }

    @Override
    void cancelInsurance() {
        System.out.println("To cancel insurance submit the following form");
    }
}
