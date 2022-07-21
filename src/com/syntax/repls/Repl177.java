package com.syntax.repls;

class Repl177 implements Functions{
    public double adding (double firstNumber, double SecondNumber){
        double addResult = firstNumber+SecondNumber;
        return addResult;
    }
    public double subtracting (double firstNumber, double SecondNumber){
        double subResult = firstNumber-SecondNumber;
        return subResult;
    }
    public double multiply (double firstNumber, double SecondNumber){
        double multResult = firstNumber*SecondNumber;
        return multResult;
    }
    public double dividing (double firstNumber, double SecondNumber){
        double divResult = firstNumber/SecondNumber;
        return divResult;
    }
    public void display(double result){
        System.out.println("Result is ::: "+result);
    }

    public static void main(String[] args) {
        double firstNumber = 100.00;
        double secondNumber = 20.00;
        Repl177 main = new Repl177();

        main.display(main.adding(firstNumber, secondNumber));
        main.display(main.subtracting(firstNumber, secondNumber));
        main.display(main.multiply(firstNumber, secondNumber));
        main.display(main.dividing(firstNumber,secondNumber));

    }
}
interface Outputs{
    void display(double result);
}
interface Functions extends Outputs{
    double adding (double firstNumber, double SecondNumber);
    double subtracting (double firstNumber, double SecondNumber);
    double multiply (double firstNumber, double SecondNumber);
    double dividing (double firstNumber, double SecondNumber);
}


