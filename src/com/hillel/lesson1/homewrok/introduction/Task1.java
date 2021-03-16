package com.hillel.lesson1.homewrok.introduction;

public class Task1 {
    public static void main(String[] args) {
        /*Task 1:  Создайте все известные примитивы по 1 экземпляру(кроме int и double) и строку двумя разными способами.
        Создайте 3 переменные int в одну строку и 3 переменные double в одну строку.*/

        byte b; // from -128 to 127;
        short s; // from -32768 to 32767;
        long l; // from -9223372036854775808L to 9223372036854775807L;
        float f; // from 1.4e-45f to 3.4e+38f;

        boolean logical;
        char c;

//        не совсем понял про два разных способа, надеюсь имелось в виду это:
        String str1 = new String("str1"); // -> значение присвоил просто для примера;
        String str2 = "str2";
        String str3 = "str2";

        int i1, i2, i3; // from -2147483648 to 2147483647
        double d1, d2, d3; // from 4.9e-324 to 1.7e+308

    }
}
