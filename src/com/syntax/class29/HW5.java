package com.syntax.class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HW5 {
    /*
    Create a map of a building. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    Update company on a 4th floor
    Remove company on the 7th floor
    Print your map
     */
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> building = new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Facebook");
        building.put(3,"Microsoft");
        building.put(3, "Ernst&Young");
        building.put(4, "Netflix");
        building.put(5, "Facebook");
        building.put(7, "Google");

        Set<Map.Entry<Integer, String>> entries = building.entrySet();
        System.out.println("entries = " + entries.size());
        building.replace(4, "LG");
        building.remove(5);

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry);
        }





    }
}
