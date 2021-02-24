package com.vytrack.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {


    //#1- Create the object of Properties
    private static Properties properties = new Properties();

    static {
        //#2- Get the path and open the file
        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            //#3- Load the opened file into properties object
            properties.load(file);

            //closing the file in JVM Memory
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //#4- Use the object to read from the configuration.properties file
    public static String getProperty(String keyWord){return properties.getProperty(keyWord);}


}
