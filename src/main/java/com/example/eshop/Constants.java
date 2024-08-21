package com.example.eshop;

public class Constants {
    public final static String URL = "jdbc:mysql://host.docker.internal:3307/eshop";
    public final static String USERNAME = "root";
    public final static String PASSWORD = "root";

    private Constants() {
        throw new AssertionError("Cannot instantiate the Constants class");
    }

}
