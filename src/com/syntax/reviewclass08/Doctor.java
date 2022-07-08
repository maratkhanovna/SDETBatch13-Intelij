package com.syntax.reviewclass08;

public class Doctor {
     public String firstName, lastName;
     protected String speciality;
    int experience;
    private double salary;
    public static String hospital;

    public Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Doctor(String firstName, String lastName, String speciality, int experience){
        this(firstName, lastName);
        this.speciality = speciality;
        this.experience = experience;
    }
     public void printInfo(){
        System.out.println("Doctor's name is "+firstName+" "+lastName+" and speciality is "+speciality);
    }
    //instance accessing both static and instance
    protected void work(){
        System.out.println("Doctor "+lastName+" works at "+hospital);
    }

    void treat(String patientName){
        this.printInfo();
        System.out.println(" Treats patient "+patientName);
    }

    private void getPaid(){
        System.out.println("Doctor "+lastName+" gets paid "+salary);
    }
    //static methods can work only with static variables
    public static void study(String university){
        //printInfo(); => this instance method will not work in static method we will get an error
        System.out.println("Doctor studied at "+university+" and now works at "+hospital);
    }
}
