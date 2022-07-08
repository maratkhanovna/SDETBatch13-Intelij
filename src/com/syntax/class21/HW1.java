package com.syntax.class21;

public class HW1 {
    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    Rectangle
    Square
    Box
     */
}

class Area {
    static void calculateArea(int length, int width) {
        int area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }

    static void calculateArea(int side) {
        int area = side * side;
        System.out.println("Area of Square = " + area);
    }

    static void calculateVolume(int width, int height, int depth) {
        int volume = width * height * depth;
        System.out.println("Volume of a box = " + volume);
    }


}
