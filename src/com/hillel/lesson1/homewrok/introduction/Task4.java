package com.hillel.lesson1.homewrok.introduction;

public class Task4 {
    public static void main(String[] args) {
        /*Task 4: Напишите не менее 5 разных примеров используя логические операции с выводом результатов
        (несколько значений "true" & несколько значений "false").
            Например:
                int a = 5;
                int b = 10;
                System.out.println(a > b); // Выведет false
                System.out.println(a < b); // Выведет true*/

//        1.
        char a1 = 'a', b1 = 'b';
        boolean res1 = a1 > b1;
        System.out.println("Result \"" + a1 + " > " + b1 + "\" is: " + res1);
        System.out.println(a1 < b1);
        System.out.println(a1 == b1);
        System.out.println(a1 != b1);

//        2.
        int a2 = 2, b2 = 2;
        System.out.println("2:");
        System.out.println(a2 > b2);
        System.out.println(a2 < b2);
        System.out.println(a2 == b2);
        System.out.println(a2 != b2);

//        3.
        String str1 = "String1";
        String str2 = "String1";
        System.out.println("3:");
//        System.out.println(str1 > str2); -> can`t be done as is with String;
//        System.out.println(str1 < str2); -> can`t be done as is with String;
        System.out.println(str1 == str2);
        System.out.println(str1 != str2);

//        4.
        String string1 = "String1"; // *понимаю, что лучше избегать имен переменных схожих с обозначением типов данных.
        String string2 = "String2";
        System.out.println("4:");
        System.out.println(string1 == string2);
        System.out.println(string1 != string2);

//        5.
        String str3 = "String3";
        String str4 = new String ("String3");
        System.out.println("5:");
        System.out.println(str3 == str4);
        System.out.println(str3 != str4);
        System.out.println(str3.equals(str4));


    }
}
