package com.syntax.class16;

public class InstanceDemo {
    String str = "instance";
    void changesInstanceValue() {
        str="Captain Marvel";
    }
    void printInstanceValue() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        InstanceDemo id = new InstanceDemo();
        System.out.println(id.str);// prints the value of str which is Instance
        id.printInstanceValue(); // method 1 simple prints the value of str which is still Instance
        id.changesInstanceValue(); // this method changes the instance variable value which will be not Captain Marvel
        id.printInstanceValue(); //method once simple prints the value of str which is now instance Captain Marvel
    }
}
