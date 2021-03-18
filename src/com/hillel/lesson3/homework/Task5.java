package com.hillel.lesson3.homework;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*5)   Создать 2 схожих метода, которые будут случайным образом генерировать Вашу зарплату.
        Обратите внимание, что именно метода, а не просто вызовы указанных функций.
        В одном методе используйте класс Random, в другом Math.random.
        Для себя поймите разницу в использовании.
        Если не хотите получать маленькую зарплату, то можете выполнить дополнительные действия с Math.random)*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Your min wanted salary is: ");
        int minWanted = sc.nextInt();
        sc.close();

//        *нарошно сделал оба метода таким образом, чтобы не выдавали какой-то космос;
        int sal1 = salaryRandom(minWanted);
        System.out.println("Your min wanted salary is " + minWanted + " but great Random purpose you: " + sal1);

        int sal2 = salaryMathRandom(minWanted);
        System.out.println("Your min wanted salary is " + minWanted + " but great Math.random purpose you: " + sal2);
    }

    private static int salaryRandom(int min) {
        Random random = new Random();
        return min + random.nextInt(min);
    }

    private static int salaryMathRandom(int min) {
        return (int)(min + Math.random()*100);
    }

}
