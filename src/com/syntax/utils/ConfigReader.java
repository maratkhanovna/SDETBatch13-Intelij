package com.syntax.utils;


import java.io.IOException;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    public static Properties read(String path) throws IOException {
        //Navigate to the location
        FileInputStream fileInputStream = new FileInputStream(path);
        //Properties class that handles the .properties files
        Properties properties = new Properties();
        //Loads the data from the HardDrive to RAM
        properties.load(fileInputStream);
        return properties;
    }
}
