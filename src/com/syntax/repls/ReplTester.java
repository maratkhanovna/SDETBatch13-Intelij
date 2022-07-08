package com.syntax.repls;

public class ReplTester {
    static String censorLetter (String givenString, char givenChar){
        return givenString.replace("givenChar", "*");
    }
    int year;
    String schoolName;
    int batch;


    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println(stringBuffer.append(" World").toString().toUpperCase());

        System.out.println(censorLetter("computer science", 'e'));

        ReplTester obj = new ReplTester();
        obj.year=2021;
        obj.schoolName="Syntax";
        obj.batch=9;
        System.out.println("I am a student of batch "+obj.batch+" studying at "+obj.schoolName+" in the year of "+obj.year);
    }
}
