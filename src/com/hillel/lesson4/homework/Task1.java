package com.hillel.lesson4.homework;

import java.util.Scanner;

/*1)   Вывести на экран числа от 1 до 10 используя while.
    Пример: 1 2 3 4 5 6 7 8 9 10
    Реализовать в отдельном методе.*/
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seed value: ");
        int min = sc.nextInt();
        System.out.print("Enter finite number: ");
        int max = sc.nextInt();
        printFromMinToMax(min, max);
        sc.close();
    }

    private static void printFromMinToMax(int from, int to) {
        while (from <= to){
            System.out.print(from + " ");
            from++;
        }
    }
}
