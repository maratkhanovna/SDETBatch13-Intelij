package com.syntax.class27;

import java.util.ArrayList;

public class ListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> legends= new ArrayList<>();//recommended
        legends.add("Hamid");
        legends.add("Karla");
        legends.add("Naveed");
        legends.add("Tara");
        legends.add("Yusuf");
        legends.add("Yusuf");
        legends.add("Herbert");
        legends.add("Yusuf");
        System.out.println(legends.get(4));
        System.out.println(legends.get(2));
        System.out.println(legends);
        legends.set(0,"Hamid Jan");// replaces the element at the specified position in this list with the specified element
        System.out.println(legends);
        System.out.println(legends.indexOf("Yusuf")); // shows index of the first element
        System.out.println(legends.lastIndexOf("Yusuf")); // shows index of the last element

        //Returns a view of the portion of this list between the specified fromIndex,
        // inclusive, and toIndex, exclusive. (If fromIndex and toIndex are equal, the returned list is empty.)
        System.out.println(legends.subList(0,3));


    }
}
