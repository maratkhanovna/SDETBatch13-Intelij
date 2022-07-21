package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hope");
        words.add("Play");
        words.add("Come");
        words.add("Frame");
        words.add("Game");
        // NEVER USE loops simple for loop. Enhanced for loop or while loop whenever you are
        //planing to use any method that can change the size of a list

        /*for(String word:words){
            if(word.endsWith("e")){
                words.remove(word);
            }
        }
        for(int i=0; i< words.size(); i++){
            if(words.get(i).endsWith("e")){
                words.remove(i);
            }
        }
        System.out.println("words = " + words);*/

        /* System.out.println(iterator.hasNext());//true checks if there is a next element
        System.out.println(iterator.next());//Hope
        System.out.println(iterator.hasNext());//true
        System.out.println(iterator.next());//play
        System.out.println(iterator.hasNext());//false
        System.out.println(iterator.next());//error NoSuchElementException
        */
        //System.out.println(iterator.next());

        words.removeIf(s -> s.endsWith("e")); //best way to use lambda expression

        Iterator<String> iterator = words.iterator();
        while(iterator.hasNext()){
            if(iterator.next().endsWith("e")){
                iterator.remove();
            }
        }


        System.out.println(words);
    }

}
