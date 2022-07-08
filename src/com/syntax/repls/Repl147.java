package com.syntax.repls;

public class Repl147 {
    public static void main(String[] args) {
        CarObjects obj1 = new CarObjects("Toyota 2019", 25000, 100);
        obj1.carStockValue();
        CarObjects obj2 = new CarObjects("BMW 2019", 26119.2, 25);
        obj2.carStockValue();
        System.out.println(99.98/10);
    }
}

class CarObjects{
    String model;
    double price;
    int quantity;
    CarObjects(String model, double price, int quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;
    }
    void carStockValue(){
        double stock = price*quantity;
        System.out.println(model+" Stock Value "+stock);
    }
}
