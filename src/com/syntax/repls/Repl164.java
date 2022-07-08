package com.syntax.repls;

public class Repl164 {
    public static void main(String[]args){
        Parent[] subClasses={new Child1(), new Child2(), new Child3()};
        for(Parent children:subClasses){
            children.hello();
        }
    }
}
class Parent{
    void hello(){
        System.out.println("method in Parent class");
    }
}
class Child1 extends Parent{
    void hello(){
        System.out.println("method in Child1 class");
    }
}
class Child2 extends Parent{
        void hello(){
        System.out.println("method in Child2 class");
        }
        }
class Child3 extends Parent{
        void hello(){
        System.out.println("method in Child3 class");
        }
        }

