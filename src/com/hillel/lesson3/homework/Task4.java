package com.hillel.lesson3.homework;

/*4)  Используя класс Math напишите 7-8 примеров вызовов вспомогательных методов данного класса:
    о sqrt();
    o abs();
    o min();
    o max();
    o random();
    o ….(остальные на Ваш выбор);*/
public class Task4 {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(7)); // - извлекает корень числа;
        System.out.println(Math.abs(-5)); // - возвращает число положительным;
        System.out.println(Math.min(218, 127)); // - выводит наименьшее число;
        System.out.println(Math.max(345, 901)); // - выводит наибольшее число;
        System.out.println(Math.random()); // - рандомное число от 0.0 до 1.1, если при помощи умножения на 10/100/1000 и т.д. не указать количество знаков перед запятой;
//        Other:
        System.out.println(Math.pow(2, 3)); // - возводит число в степень Math.pow(число, в какую степень возвести)
        System.out.println(Math.floor(3.14)); // - возвращает наибольшее целое число, не больше чем указанное;
        System.out.println(Math.ceil(3.14)); // - возвращает наименьшее целое число, не меньше чем указанное;
        System.out.println(Math.round(2.4)); // - округляет до целого числа и выводит без точки, но все равно нужно делать преобразование в int;
        System.out.println(Math.rint(2.4)); // - округляет до целого числа, но выводит с точкой;

    }
}
