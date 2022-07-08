package com.syntax.class17;

public class Tester {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name="Maike";
        //employee.salary=125000; because it's private in Employee class in the same package
        employee.department="IT Saver";
        Teacher teacher = new Teacher();
        teacher.name="Zombie";
        teacher.schoolName="Marvard";
        teacher.printInfo();  //Because printInfo is public we can call it in other classes
        // and because it is the part of Teacher class it can access the private fields
        // which in turn let us access those fields

    }
}
