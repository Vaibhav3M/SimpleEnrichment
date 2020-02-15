package com.munvo.enrichment.configuration;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

// Converted to a Singleton class
public class Configuration {

    // Singleton instance
    private static Configuration singletonInstance;

    private String studentName;
    private String type;
    private String fileName;

    // Constructor made private to enforce singleton
    private Configuration() {
        Config config = ConfigFactory.load();
        this.studentName = config.getString("name");
        this.type = config.getString("type");
        this.fileName = config.getString("fileName");
    }

    public static Configuration getInstance() {

        // check if singleton instance not created yet
        if (singletonInstance == null) {
            singletonInstance = new Configuration();
        }

        return singletonInstance;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getType() {
        return type;
    }

    public String getFileName() {
        return fileName;
    }
}