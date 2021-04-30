package com.hillel.lesson12.homework;

/*Создайте 3 класса, в каждом из которых будет по одному методу с разным названием
(Остальное не имеет значения);*/
public class Class1 {
    private String str;

    protected Class1(){
        this.str = "class1Element";
    }

    @Override
    public String toString() {
        return str;
    }
}
