package com.hillel.lesson3.homework;

public class Task2 {
    public static void main(String[] args) {
        /*2)   Создайте 3 переменные типа int и 3 переменные типа double используя класс Random,
         выполните их сложение и выведите результат. */

        int i1 = (int)(Math.random()*10);
        int i2 = (int)(Math.random()*100);
        int i3 = (int)(Math.random()*1000);

        double d1 = Math.random();
        double d2 = Math.random();
        double d3 = Math.random();

//        Первый вариант вывода:
        double sum = i1 + i2 + i3 + d1 + d2 + d3;
        System.out.println("Sum of all digits is: " + sum);

//        Второй вариант вывода:
        System.out.println("Sum of all digits is: " + (i1 + i2 + i3 + d1 + d2 + d3));



    }
}
