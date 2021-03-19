package com.hillel.lesson4.homework;

/*4) Вывести на экран числа в порядке уменьшения от 100 до 0 с шагом в 10 единиц. Использовать for.
    Пример: 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0
    Реализовать в отдельном методе.*/
public class Task4 {
    public static void main(String[] args) {
        printFrom100To0CycleFor();
    }

    private static void printFrom100To0CycleFor() {
        for (int i = 100; i >= 0; i -= 10){
            System.out.print(i + " ");
        }
    }
}
