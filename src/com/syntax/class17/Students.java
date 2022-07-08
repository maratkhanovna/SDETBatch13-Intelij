package com.syntax.class17;

public class Students {
    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students

    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students st1 = new Students();
        st1.name="Gaukhar";
        st1.id="GR001";
        numberOfStudents=1;

        Students st2 = new Students();
        st1.name="Samira";
        st1.id="SP002";
        numberOfStudents++;

        System.out.println(numberOfStudents);
    }
}
