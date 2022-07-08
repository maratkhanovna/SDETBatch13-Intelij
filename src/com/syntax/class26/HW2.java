package com.syntax.class26;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class HW2 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Tesla");
        cars.add("Hyundai");

        for (String car:cars) {
            System.out.print(car+" ");
        }
        System.out.println();

        for (int i=0; i<cars.size(); i++){
            System.out.print(cars.get(i)+" ");
        }
        System.out.println();
        System.out.println(cars);

    }
}
