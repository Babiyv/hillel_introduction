package com.hillel.lesson4.homework;

/*5) Дано 10 чисел (возможно массив).
    Напечатайте наибольшее из них в консоль, используя циклические и условные операторы.*/
public class Task5 {
    public static void main(String[] args) {
        int[] intArray = {2, 3, 1, 5, 8, 6, 7, 10, 9, 4};
        int max = intArray[0]; // - на тот случай, если наибольшее число у нас окажется в первой ячейке
        for (int i = 0; i < intArray.length - 1; i++) {
            if (max < intArray[i + 1]){
                max = intArray[i + 1];
            }
        }
        System.out.println(max);
    }
}
