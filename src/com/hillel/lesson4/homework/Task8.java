package com.hillel.lesson4.homework;

import java.util.Scanner;

/*8) Предположим что у нас есть сайт, где ограничено посещение пользователей от 18 до 50 лет.
    Необходимо написать программу, которая будет запрашивать год Вашего рождения и выдавать следующие ответы:
        о “Вход строго с 18 лет” (Если пользователю меньше 18 лет);
        о “Добро пожаловать” (Если возраст от 18 до 50 лет);
        о “Вам будет не интересно на этом сайте(Если больше 50);*/
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minAge = 18, maxAge = 50;

        System.out.print("Введите свой возраст: ");
        int userAge = sc.nextInt();

        if (userAge < minAge){
            System.out.println("Вход строго с 18 лет!");
        } else if (userAge > maxAge){
            System.out.println("Вам будет не интересно на этом сайте.");
        } else {
            System.out.println("Добро пожаловать!");
        }

    }
}
