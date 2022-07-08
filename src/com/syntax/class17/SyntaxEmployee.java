package com.syntax.class17;

public class SyntaxEmployee {
    //Create a Class called SyntaxEmployee:
    //Create three  variables  empID , salary and set the CEO to “Sumair”
    //Create two objects of the class SyntaxEmployee
    //Set the value of eID, salary for each of the objects
    //Print out the eID , salary and  CEO for each of the objects

    String employeeId;
    int salary;
    static String ceo = "Sumair";

    public static void main(String[] args) {
        SyntaxEmployee emp1 = new SyntaxEmployee();
        SyntaxEmployee emp2 = new SyntaxEmployee();

        emp1.employeeId="0001";
        emp2.employeeId="0002";

        emp1.salary=215000;
        emp2.salary=220000;
        System.out.println(emp1.employeeId+" "+emp1.salary+" "+ceo);
        System.out.println(emp2.employeeId+" "+emp2.salary+" "+ceo);

    }


}
