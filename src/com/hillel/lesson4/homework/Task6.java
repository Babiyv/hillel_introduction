package com.hillel.lesson4.homework;

/*6)   Дано 10 чисел (возможно массив). Напечатайте наименьшее из них в консоль, используя циклические и условные операторы.*/
public class Task6 {
    public static void main(String[] args) {
        int[] intArray = {2, 3, 1, 5, 8, 6, 7, 10, 9, 4};
        int min = intArray[0]; // - на тот случай, если наименьшее число у нас окажется в первой ячейке
        for (int i = 1; i < intArray.length; i++) {
            if (min > intArray[i]){
                min = intArray[i];
            }
        }
        System.out.println(min);
    }
}
