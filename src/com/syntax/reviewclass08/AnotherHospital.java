package com.syntax.reviewclass08;

public class AnotherHospital {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Sherlock", "Holmes", "Magic", 10);

        //access methods to test visibility
        doc.printInfo(); //access to public
        doc.work(); // access to protected
        doc.treat("Samantha"); //access to default
        Doctor.study("GW"); //access to public
    }
}
