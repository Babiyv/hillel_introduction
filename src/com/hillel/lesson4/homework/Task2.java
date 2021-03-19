package com.hillel.lesson4.homework;

/*2)   Вывести на экран числа от 1 до 10 используя for.
    Пример: 1 2 3 4 5 6 7 8 9 10
    Реализовать в отдельном методе.*/
public class Task2 {
    public static void main(String[] args) {
        print1To10For();
    }

    private static void print1To10For() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}
