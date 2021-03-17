package com.hillel.lesson2.homework;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*5) Создать одномерный массив любого размера. Записать в него 10 примитивов int.
        Значение в ячейках, индекс которых имеет нечетное значение, увеличить вдвое.
        Значение в ячейках, индекс которых имеет четное значение, уменьшить на 2.
        Вывести значение массива до изменения и после для сравнения результата.*/

        int[] intArray = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter digit #" + (i + 1) + ": ");
            intArray[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0){
                System.out.print("Array #" + (i + 1) + " before operation is: " + intArray[i] + ". ");
                intArray[i] *= 2;
                System.out.println("After multiplication in 2 times is: " + intArray[i] + ".");
            } else {
                System.out.print("Array #" + (i + 1) + " before operation is: " + intArray[i] + ". ");
                intArray[i] -= 2;
                System.out.println("After subtraction is: " + intArray[i] + ".");
            }
        }



    }
}
