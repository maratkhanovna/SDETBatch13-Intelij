package com.syntax.class18;

public class Homework04 {
    /* Write a java Class Students that have a constructor
which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
Test Student class for 5 different students with different marks.
Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables. */


    int g1Marks;
    int g2Marks;
    int g3Marks;
    String name;
    Homework04(String name, int grad1Marks, int grad2Marks, int grad3Marks){
        g1Marks=grad1Marks;
        g2Marks=grad2Marks;
        g3Marks=grad3Marks;
        this.name=name;
    }
    public void calcAvgGrade(){
        int avgGrade = (g1Marks+g2Marks+g3Marks)/3;
        System.out.println(name+avgGrade);
    }

    public static void main(String[] args) {
        Homework04 student = new Homework04("gaukhar", 90, 80, 98);
        student.calcAvgGrade();
    }
}
