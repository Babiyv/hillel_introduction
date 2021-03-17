package com.hillel.lesson3.homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*1)   Используя класс Scanner, написать  программу, которая будет запрашивать пользователя ввести данные о себе для регистрации
        и после введенных данных будет выводить всю информацию в консоль:
        o Введите Ваше имя:
        о Введите Вашу фамилию:
        о Укажите сколько Вам полных лет:
        о Введите Вашу почту для регистрации:
        о Напишите несколько слов о себе:

    p.s.: Можно оформить как в классе Main, так и в отдельном методе или классе.
    При этом надо показать как вы будете вызывать данных класс или метод.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите Ваше имя: ");
        String name = sc.nextLine();
        name = checkIfEmpty(name);

        System.out.print("Введите Вашу фамилию: ");
        String surname = sc.nextLine();
        surname = checkIfEmpty(surname);

        System.out.print("Укажите сколько Вам полных лет: ");
        String age = sc.nextLine();
        while (age.indexOf('0') == 0 || age.contains("-") || age.isEmpty()){
            System.out.print("Возраст не может быть 0 или меньше. Введите корректное значение: ");
            age = sc.nextLine();
        }

        System.out.print("Введите Вашу почту для регистрации: ");
        String email = sc.nextLine();
        while (!email.contains("@") && !email.contains(".")) {
            System.out.print("Неверно введенный адрес эл. почты. Пожалуйста введите правильный адресс: ");
            email = sc.nextLine();
        }

        System.out.print("Напишите несколько слов о себе: ");
        String description = sc.nextLine();
        description = checkIfEmpty(description);
        sc.close();

        showEntryData(name, surname, age, email, description);

    }



    private static String checkIfEmpty (String str){
        Scanner sc = new Scanner(System.in);
        while (str.isEmpty()){
            System.out.print("Это поле не может быть пустым. Введите корректные данные: ");
            str = sc.nextLine();
        }
        return str;
    }

    private static void showEntryData (String name, String surname, String age, String email, String description){
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Возраст: " + age);
        System.out.println("E-mail: " + email);
        System.out.println("О себе: " + description);
    }

}
