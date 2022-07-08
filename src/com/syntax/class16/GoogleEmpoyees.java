package com.syntax.class16;

public class GoogleEmpoyees {
    String name;
    double salary;
    static int noOfEmployees;
    static String companyName = "Google";

    void displayEmployeeInfo() {
        System.out.println("Name "+name+" Salary"+salary+" Company Name "+companyName);
    }

    public static void main(String[] args) {
        GoogleEmpoyees emp1 = new GoogleEmpoyees();
        emp1.name="Oleg";
        emp1.salary=250000;
        emp1.noOfEmployees=1;
        emp1.displayEmployeeInfo();

        GoogleEmpoyees emp2 = new GoogleEmpoyees();
        emp2.name="Sameer";
        emp2.salary=250001;
        emp2.noOfEmployees=2;
        emp2.displayEmployeeInfo();
    }
}

