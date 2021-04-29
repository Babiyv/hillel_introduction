package com.hillel.lesson12.homework;

public class Class1 {
    private String str;

    protected Class1(){
        this.str = "a";
    }

    @Override
    public String toString() {
        return "Class1{" +
                "str='" + str + '\'' +
                '}';
    }
}
