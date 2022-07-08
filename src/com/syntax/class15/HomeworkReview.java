package com.syntax.class15;

public class HomeworkReview {
    void sayHello (String country) {
        String hello;
        switch (country) {
            case "USA":
                hello = "Hi";
                break;
            case "Russia":
                hello = "Privet";
                break;
            case "Kazakhstan":
                hello = "Salem";
                break;
            case "Turkiye":
                hello = "Merhaba";
                break;
            default:
                hello = "Country not found";
        }
        System.out.println(hello);
    }

    String completeEmail(String firstName, String lastName, String emailType) {
        return firstName+lastName+"@"+emailType+".com";

    }

    boolean isPrime (int x){
        boolean isPrime = true;
        if(x>1) {

            for(int i=2;i<x;i++) {
                if(x%i==0) {  // if the number that user has provided if that number is completely divisable by any other number
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        HomeworkReview homeworkReview = new HomeworkReview();
        homeworkReview.sayHello("Kazakhstan");
        System.out.println(homeworkReview.completeEmail("Gaukhar", "Razakberlina", "gmail"));
        System.out.println(homeworkReview.isPrime(5));
    }
}
