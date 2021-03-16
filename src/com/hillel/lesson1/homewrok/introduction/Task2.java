package com.hillel.lesson1.homewrok.introduction;

public class Task2 {
    public static void main(String[] args) {
        /*Task 2: С созданными переменными напишите 10 примеров с двумя любыми арифметическими операциями в каждом
        (5 дробных результата и 5 целочисленных) и выведите результаты.
            Например:
            int a = 5, b = 10;
            byte c = 6;
            int result = a + b - c;
            System.out.println(result);*/

        byte b0 = 0, b1 = 127, b2 = -128; // <- вывел в строку нарошну, хоть мне и удобнее когда идут каждый в новой строке;

//        1.
        byte byteResult = (byte)((b1 + b2) * b0);
        System.out.println("Result 1 (byte) is: " + byteResult);

//        2.
        short shortResult = (short)(b1 * 3 - b2);
        System.out.println("Result 2 (short) is: " + shortResult);

//        3.
        int intResult = byteResult;
        intResult += shortResult * b1;
        System.out.println("Result 3 (int) is: " + intResult);

//        4.
        char a = 'a';
        char b = 'b';
        char charResult = (char) (a + b - a);
        System.out.println("Result 4 (char) is: " + charResult);

//        5.
        long l1 = 3525225513134L;
        long longResult = l1 * intResult - shortResult;
        System.out.println("Result 5 (long) is: " + longResult);

//        6.
        float floatPi = 3.14f;
        float floatResult = b1 + floatPi * 2;
        System.out.println("Result 6 (float) is: " + floatResult);

//        7.
        float floatResult2 = (float) (Math.pow(floatPi, 3) + 0.0000001);
        System.out.println("Result 7 (float) is: " + floatResult2);

//        8.
        float floatResult3 = floatResult2 * floatResult + 0.141515141f;
        System.out.println("Result 8 (float) is: " + floatResult3);

//        9.
        double doubleResult1 = longResult * floatResult2 + Math.sqrt(23);
        System.out.println("Result 9 (double) is: " + doubleResult1);

//        10
        double doubleResult2 = doubleResult1 + longResult * 0.141515141;
        System.out.println("Result 10 (double) is: " + doubleResult2);



    }
}
