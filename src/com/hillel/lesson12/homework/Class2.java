package com.hillel.lesson12.homework;

/*Создайте 3 класса, в каждом из которых будет по одному методу с разным названием
(Остальное не имеет значения);*/
public class Class2 {
    private String b;
    protected Class2() {
        this.b = "class2Element";
    }

    @Override
    public String toString() {
        return b;
    }
}
