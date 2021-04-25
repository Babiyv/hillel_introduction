package com.hillel.lesson14;

public class MyCustomException extends Exception{
    @Override
    public String getMessage() {
        return "My custom exception is there";
    }
}
