package com.hillel.lesson2.homework;

public class Task3 {
    public static void main(String[] args) {
        /*3)   Создать 3 целочисленных и 3 дробных переменных,
        выполнить несколько неявных преобразований и
        вывести сумму всех 6 переменных преобразовав к строке(тип String);*/

        byte b = 12;
        short s = 12343;
        int i = s;

        float f1 = 3.14f;
        float d1 = f1 * 2;
        double d2 = 1415155144.14144;

        double sum = b + s + i + f1 + d1 + d2;
        System.out.println(Double.toString(sum)); // -> первый вариант вывода, если не хотим создавать отдельную переменную String. Кажется наиболее оптимальным.

//        Второй вариант вывода, если хотим для чего-то сохранить еще и сам стринг:
        String str = Double.toString(sum);
        System.out.println(str);

//        Третий вариант вывода, если не хотим минималистичный код и не сохранять сумму всех значений (double sum):
        System.out.println(Double.toString(b + s + i + f1 + d1 + d2));


    }
}