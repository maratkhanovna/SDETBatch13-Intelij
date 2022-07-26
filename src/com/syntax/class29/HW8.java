package com.syntax.class29;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HW8 {
    /*
    Create a Person class with following private fields: name, lastName, age, salary.
    Variables should be initialized through constructor.
    Inside the class also create a method to print user details.
    In Test Class create a Map that will store key in ascending order.
    In that map store personId and a Person Object. Print each object details.
     */
    public static void main(String[] args) {
        TreeMap<Integer, Person> treeMap = new TreeMap<>();
        treeMap.put(0001, new Person("Jane", "Ostin", 30, 85000));
        treeMap.put(0002, new Person("Kate", "Smith", 28, 93000));
        treeMap.put(0003, new Person("Peri", "Lane", 25, 80000));
        treeMap.put(0004, new Person("Coach", "Kors", 27, 100000));

        for (Person p: treeMap.values()) {
            System.out.println(p);
        }
    }

}
class Person{
    private String name;
    private String lastName;
    private int age;
    private int salary;

    public Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    void userDetails(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
