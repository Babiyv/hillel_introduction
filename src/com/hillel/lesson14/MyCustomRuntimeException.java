package com.hillel.lesson14;

public class MyCustomRuntimeException extends RuntimeException{
    @Override
    public String getMessage() {
        return "my custom runtime exception is there!)";
    }
}
