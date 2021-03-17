package com.hillel.lesson5;

import java.util.Scanner;

public class TestWork2 {
    public static void main(String[] args) {

//        Вводим 10 числел и выводим их на экран в отдельную строчку с помощью отдельного метода.

        Scanner sc = new Scanner(System.in);
        int[] myArray = new int [5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter digit #" + (i + 1));
            myArray[i] = sc.nextInt();
        }
        sc.close();
        returnDigit(myArray);

    }

    private static void returnDigit (int[] inputArray){
        for (int i = 0; i < 5; i++) {
            System.out.print(inputArray[i] + " ");
        }
    }

}
