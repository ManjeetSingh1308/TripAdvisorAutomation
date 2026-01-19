package com.example.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static final Properties props = new Properties();

    static {
        try (InputStream in = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("config.properties")) {
            if (in != null) {
                props.load(in);
            } else {
                System.err.println("config.properties not found on classpath");
            }
        } catch (IOException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }

    public static boolean getBoolean(String key, boolean defaultVal) {
        String v = props.getProperty(key);
        return v == null ? defaultVal : Boolean.parseBoolean(v);
    }
}
