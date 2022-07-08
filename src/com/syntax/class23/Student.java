package com.syntax.class23;

public class Student {
    void method(){
        System.out.println("doing homework");
    }
    void method2(){
        System.out.println("passing exams");
    }
    void method3(){
        System.out.println("learning subjects");
    }
}
class SyntaxStudent extends Student{
    @Override
    void method() {
        System.out.println("doing repls");
    }

    @Override
    void method3() {
        System.out.println("learning Java");
    }
}
class CollegeStudent extends Student{
    @Override
    void method2() {
        System.out.println("passing quizes");
    }
}
class SchoolStudent extends Student{
    @Override
    void method3() {
        System.out.println("learning algebra");
    }
}
class Test{
    public static void main(String[] args) {
        Student[] student = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student students:student){
            students.method();
            students.method2();
            students.method3();
        }
        for(int i=0; i<student.length;i++){
            student[i].method();
            student[i].method2();
            student[i].method3();
        }
    }
}
