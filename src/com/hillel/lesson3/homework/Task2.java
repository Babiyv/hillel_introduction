package com.hillel.lesson3.homework;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        /*2)   Создайте 3 переменные типа int и 3 переменные типа double используя класс Random,
         выполните их сложение и выведите результат. */

        Random random = new Random(); // <- мне почему-то более комфортно с Math.random(), по крайней мере там числа только больше нуля:)

        int i1 = random.nextInt(10);
        int i2 = random.nextInt(100);
        int i3 = random.nextInt(1000);

        double d1 = random.nextDouble(); // <- не понял как в случаем с double: указать максимально генерируемое значение, ограничить количество знаков после запятой.
        double d2 = random.nextDouble();
        double d3 = random.nextDouble();

//        Первый вариант вывода:
        double sum = i1 + i2 + i3 + d1 + d2 + d3;
        System.out.println("Sum of all digits is: " + sum);

//        Второй вариант вывода:
        System.out.println("Sum of all digits is: " + (i1 + i2 + i3 + d1 + d2 + d3));

    }
}
