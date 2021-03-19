package com.hillel.lesson4.homework;

/*3) Вывести на экран числа в порядке уменьшения от 100 до 0 с шагом в 10 единиц.
    Использовать while.
    Пример: 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0
    Реализовать в отдельном методе.*/
public class Task3 {
    public static void main(String[] args) {
        printFrom100To0();
        System.out.println();
        printReverseWhile(100, 0, 5); // просто попробовал сделать универсальный метод:
    }

    private static void printFrom100To0() {
        int digit = 100;
        while (digit >= 0){
            System.out.print(digit + " ");
            digit -=10;
        }
    }

    private static void printReverseWhile(int max, int min, int gap) {
        while (max >= min){
            System.out.print(max + " ");
            max -= gap;
        }
    }
}
