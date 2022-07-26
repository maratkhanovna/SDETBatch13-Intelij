package com.syntax.class30;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReadDemo {
    public static void main(String[] args) throws IOException {
        /*
        Steps to create a file:
        1. right click on any directory or package
        2. new => File => give any name and extension
         */
        //get the path of a file
        /*
        steps to get the path in intelij
        1. right click on any file
        2. click on get path reference
        3. select content root path
         */
        String path = "Files/New.properties";
        //navigate to this location with the help of FileInputStream class
        //if we want to read the data, or FileOutputStream if we want to write the data to file
        FileInputStream fileInputStream = new FileInputStream(path);

        //now we need a class that understands how to read the data from this file type
        Properties properties = new Properties();
        //loading the data from the file inside the properties Object
        properties.load(fileInputStream);

        System.out.println(properties.getProperty("user"));

        fileInputStream.close();
    }
}
