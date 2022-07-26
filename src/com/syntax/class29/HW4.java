package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;

public class HW4 {
    /*
    Create a Set collection that will hold Objects of Student Type.
    In this set we do not care about the insertion order.
    Each student object should have name and studentID. Display name of each student.
     */
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("Alen", 100));
        students.add(new Student("John", 101));
        students.add(new Student("Chris", 102));
        students.add(new Student("Karl", 103));

        Iterator <Student> iterator = students.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().studentName);
        }
    }
}
class Student{
    String studentName;
    int studentID;

    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

}
