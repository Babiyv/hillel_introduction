package com.hillel.lesson1.homewrok.introduction;

public class Task3 {
    public static void main(String[] args) {
        /*Task 3: Напишите 10 примеров с арифметическими операциями с присвоением и выведите результат.
            Например:
                int a = 5;
                a += 15;
                System.out.println(a);*/

//        1.
        int a1 = 1;
        a1++;
        System.out.println("Result #1 is: " + a1);

//        2.
        int a2 = 1;
        ++a2;
        System.out.println("Result #2 is: " + a2);

//        3.
        int a3 = 1;
        a3--;
        System.out.println("Result #3 is: " + a3);

//        4.
        int a4 = 1;
        --a4;
        System.out.println("Result #4 is: " + a4);

//        5.
        int a5 = 1;
        a5 += 2;
        System.out.println("Result #5 is: " + a5);

//        6.
        int a6 = 1;
        a6 -= 2;
        System.out.println("Result #6 is: " + a6);

//        7.
        int a7 = 1;
        a7 *= 4;
        System.out.println("Result #7 is: " + a7);

//        8.
        double a8 = 10;
        a8 /= 3;
        System.out.println("Result #8 is: " + a8);

//        9.
        double a9 = 1;
        a9 /= 0; // <- просто ради забавы и прикольного результата на консоли
        System.out.println("Result #9 is: " + a9);

//        10.
        int a10 = 10;
        a10 /= 3;
        System.out.println("Result #10 is: " + a10);

//        11.
        int a11 = 10;
        a11 %= 3;
        System.out.println("Result #11 is: " + a11);


    }
}
