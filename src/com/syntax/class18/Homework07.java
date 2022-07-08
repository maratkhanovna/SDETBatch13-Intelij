package com.syntax.class18;

public class Homework07 {
    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */

    String author;
    int pageCount;

    Homework07(String author) {
        this.author = author;
    }

    Homework07(String author, int pageCount) {
        this.author=author;
        this.pageCount=pageCount;
    }

    public static void main(String[] args) {
        Homework07 book1=new Homework07("Hemingway");
        Homework07 java=new Homework07("Unknown", 5000);
    }

}
