package com.hillel.lesson8.homework;

public class Table {

    private String material;
    private String color;
    private int length;
    private int width;

    public Table(){
    }

    public Table(int length, int width) {
        this("wood", "natural");
//        this.length = length; // - поставил ограничение по минимальному значению при вводе значение параметра через сетер, а потом понял, что мы же можем ввести неадекватное значение и просто при создании экземпляра класса, потому решил и сюда добавить "ограничитель"(хотя, на сколько понимаю, то это может считать плохой практикой?)
//        this.width = width; // - тоже самое решил сделать и со вторым парметром;
        if (length < 200){
            System.out.println("\nTable length is " + length + " millimeters only?! It can`t be so short, it`s must be at least 200 millimeters length!\n");
            this.length = 200;
        } else {
            this.length = length;
        }
        if (width < 200){
            System.out.println("\nTable width is " + width + " millimeters only?! It can`t be so thin, it`s must be at least 200 millimeters width!\n");
            this.width = 200;
        } else {
            this.width = width;
        }

    }

    public Table(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        if (length < 200){
            System.out.println("\nTable length is " + length + " millimeters only?! It can`t be so short, it`s must be at least 200 millimeters length!\n");
            this.length = 200;
        } else {
            this.length = length;
        }
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int width){
        if (width < 200){
            System.out.println("\nTable width is " + width + " millimeters only?! It can`t be so thin, it`s must be at least 200 millimeters width!\n");
            this.width = 200;
        } else {
            this.width = width;
        }
    }


    @Override
    public String toString() {
        return "material: " + material +
                "; color: " + color +
                "; length: " + length +
                "; width: " + width;
    }
}
