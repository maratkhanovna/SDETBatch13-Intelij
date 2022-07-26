package com.syntax.class29;

import java.util.Iterator;
import java.util.TreeSet;

public class HW3 {
    /*
    Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;
     */
    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>();
        cities.add("Almaty");
        cities.add("Astana");
        cities.add("Taraz");
        cities.add("Shymkent");
        cities.add("Atyrau");
        cities.add("Aktau");
        cities.add("Semey");
        cities.add("Turkestan");

        /*
        Iterator <String> iterator = cities.iterator();
        while (iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }
         */

        cities.removeIf(s -> s.startsWith("A"));
        System.out.println(cities);

    }
}
