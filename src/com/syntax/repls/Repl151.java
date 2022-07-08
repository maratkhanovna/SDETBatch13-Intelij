package com.syntax.repls;

public class Repl151 extends Method{
    public static void main(String[] args) {
        int[][]a={
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        Method.sum2D(a);
    }
}
class Method{
    static void sum2D(int[][]a){
        int sum=0;
        for (int[]i:a){
            for(int j:i){
                sum=sum+j;
            }
        }
        System.out.println(sum);
    }
}
