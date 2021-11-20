package com.openclassrooms.helloworld.model;

public class HelloWorld {
    private String value;

    public HelloWorld() {
        this.value = "Hello World";
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
