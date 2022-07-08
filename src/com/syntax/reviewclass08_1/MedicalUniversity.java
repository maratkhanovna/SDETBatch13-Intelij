package com.syntax.reviewclass08_1;

import com.syntax.reviewclass08.Doctor;

public class MedicalUniversity {
    public static void main(String[] args) {
        Doctor doc = new Doctor("John", "Smith");
        //accessing only to public
        doc.printInfo();
        Doctor.study("GW");
    }
}
