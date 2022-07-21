package com.syntax.reviewclass10;

public class Flower {
    String color;
    Flower(String color){
        this.color = color; // we can use this keyword to distinguish a local and instance variable
    }
    Flower(int color){
        // we can use this keyword to distinguish a local and instance variable
    }
    void showColor(){
        System.out.println("Flowers have beautiful colors");
    }
    void smell(){
        System.out.println("Flowers smell very good");
    }
    void bloom(){
        System.out.println("Generally bloom in spring");
    }

}
class Rose extends Flower{
    Rose(String color) {
        super(color);
    }

    @Override
    void showColor() {
        System.out.println("Roses have "+color+" colors");
    }

    @Override
    void bloom() {
        System.out.println("Roses bloom in April");
    }
    void thorns() {
        System.out.println("Please be careful");
    }

}
class Tulips extends Flower{

    Tulips(String color) {
        super(color);
    }

    @Override
    void showColor() {
        System.out.println("Tulips have "+color+" colors");
    }
}
