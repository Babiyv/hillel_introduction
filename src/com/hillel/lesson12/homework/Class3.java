package com.hillel.lesson12.homework;

/*Создайте 3 класса, в каждом из которых будет по одному методу с разным названием
(Остальное не имеет значения);*/
public class Class3 {
    private String c;
    protected Class3() {
        this.c = "class3Element";
    }

    @Override
    public String toString() {
        return c;
    }
}
