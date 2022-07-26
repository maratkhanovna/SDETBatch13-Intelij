package com.syntax.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HW9 {
    /*
    Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format
    John Smith=$100000
     */
    public static void main(String[] args) {
        HashMap<String, Integer> employees = new HashMap<>();
        employees.put("Greg Bradley", 85000);
        employees.put("Kanye West", 95000);
        employees.put("Lorane Smith", 100000);
        employees.put("Paris Hilton", 115000);
        int maxValue = 0;
        String maxKey ="";

        for (Map.Entry<String,Integer> entry : employees.entrySet()) {
            if(entry.getValue()>maxValue){
                maxValue= entry.getValue();
                maxKey= entry.getKey();
            }
        }
        System.out.println(maxKey+"=$"+maxValue);



        Iterator<Map.Entry<String, Integer>> iterator = employees.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> max = iterator.next();
            if(max.getValue()>maxValue){
                maxValue = max.getValue();
                maxKey = max.getKey();
            }
        }
        System.out.println(maxKey+"=$"+maxValue);


    }
}
