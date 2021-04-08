package com.hillel.lesson6.homework;

/*·      Дана строка: “ Hillel is my feature. I will be developer   ”
Необходимо выполнить следующие действия:
 1) Проверить не пустой ли заданный текст;
 2) Вывести длину данного текста;
 3) Вывести длину данного текста убрав лишние пробелы вначале и конце текста;
 4) Используя команду получения значения из строки по индексу вывести “I”;
 5) Используя команду обрезания вывести “developer”;
 6) Добавить в конце строки знак “!”;
 7) Выполните сравнение заданной строки со строкой:
       “Hillel is my feature. I will be DEVELOPER” так, чтобы в одном случае они были равны, а в другом не равны;
 8) Выведите данную строку в нижнем регистре;
 9) Выведите данную строку в верхнем регистре;*/

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String str = " Hillel is my feature. I will be developer   ";

//         1) Проверить не пустой ли заданный текст;
        System.out.println("#1 \n String \"str is empty?\" " + str.isEmpty()); // - самый простое и быстрое решение с выводом на консоль)


//         2) Вывести длину данного текста;
        System.out.println("#2 \n Length of string \"str\" is: " + str.length());


//         3) Вывести длину данного текста убрав лишние пробелы вначале и конце текста;
        System.out.println("#3 \n Length of string \"str\" without spaces at start and in the end is: " + str.trim().length());

        String[] regexStr = str.split(" "); // - просто чтобы поработать со сплитом и посчитат количество символов без пробелов совсем;
        String arrayToString = ""; // *если прописать "null", чтобы зарезервировать память, то работать не будет;
        for (int i = 0; i < regexStr.length; i++) {
            arrayToString = arrayToString.concat(regexStr[i]);
        }
        System.out.println(" Length of string \"str\" without ANY spaces: " + arrayToString.length());


//         4) Используя команду получения значения из строки по индексу вывести “I”;
        System.out.println("#4 \n Index of \"I\" is: " + str.indexOf("I"));


//        5) Используя команду обрезания вывести “developer”;
        System.out.println("#5 \n Substring of string \"str\": " + str.substring(str.indexOf("developer"), str.indexOf("  "))); // - лень было считать вручную с какой ячейки начинается слово и любопытно побаловаться:)


//        6) Добавить в конце строки знак “!”;
        System.out.println("#6 \n Added \"!\" to string: " + str.trim().concat("!")); // - trim чтобы более опрятно выглядело; учитывая следующее задание, то подумал, что нужно добавить "!" только при выводе на консоль.


//        7) Выполните сравнение заданной строки со строкой:
//       “Hillel is my feature. I will be DEVELOPER” так, чтобы в одном случае они были равны, а в другом не равны;
        String strFor7 = "Hillel is my feature. I will be DEVELOPER";
        System.out.println("#7");
        System.out.println("7.1) Is they are equals? " + str.trim().equalsIgnoreCase(strFor7));
        System.out.println("7.2) Is they are equals? " + str.trim().equals(strFor7));


//        8) Выведите данную строку в нижнем регистре;
        System.out.println("#8 \n To lower case: " + str.toLowerCase());


//        9) Выведите данную строку в верхнем регистре;
        System.out.println("#9 \n To upper case: " + str.toUpperCase());


    }
}
