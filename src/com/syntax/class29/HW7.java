package com.syntax.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HW7 {
    /*
    Create a map of Best Buy store. Place
    item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
    Retrieve all keys and values from a Best Buy map using EntrySet.
     */
    public static void main(String[] args) {
        HashMap<Integer, String> bestBuy = new HashMap<>();
        bestBuy.put(466588, "Smart TV");
        bestBuy.put(788222, "Laptop");
        bestBuy.put(655133, "Monitor");
        bestBuy.put(377654, "Camera");
        bestBuy.put(679523, "Vacuum");


        for (Map.Entry<Integer, String> entries : bestBuy.entrySet()) {
            System.out.println(entries);
        }
    }
}
