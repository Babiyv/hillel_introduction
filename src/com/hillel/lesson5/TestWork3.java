package com.hillel.lesson5;

import java.util.Scanner;

public class TestWork3 {
    public static void main(String[] args) {
        /*Ввести 3-х значное число, вывести по порядку*/
        Scanner sc = new Scanner(System.in);
//        int enteredDigit = sc.nextInt();
        int enteredDigit = 384;
        sc.close();
        System.out.println(enteredDigit / 100);
        System.out.println(enteredDigit / 10 % 10);
        System.out.println(enteredDigit % 10);


    }
}
