package com.hillel.lesson2.classwork;

import java.util.Arrays;

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /*System.out.println("Hello lesson2");

        boolean trueValue = true;
        boolean falseValue = false;

        boolean result = trueValue && falseValue;
        boolean result2 = trueValue || falseValue;

        System.out.println(result);
        System.out.println(result2);*/

//TODO: *напоминание того, что нужно сделать. Через вкладку внизу консоли (TODO) можно посмотреть в принципе все напоминалки. Пишеться прям здесь.*

      /*  int a = 1;
        int b = ++a;

        int c = 1;
        int d = c++;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("c: " + c);
        System.out.println("d: " + d);*/

        int x = 10;
        int y = --x;

        int x2 = 10;
        int y2 = x2--;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("x2: " + x2);
        System.out.println("y2: " + y2);
        System.out.println("x2 after x2--: " + x2);

        byte byteVariable = 10;
        short shortVariable = 100; //-128 +127
        int intVariable = 1000;
        long longVariable = 100000;
        float floatVariable= 10.5F;
        double doubleVariable = 15.5;

        System.out.println(byteVariable + shortVariable);
        System.out.println(intVariable+ longVariable);

        shortVariable = byteVariable;
//        byteVariable = shortVariable; -> выдаст ошибку
        byteVariable = (byte) shortVariable; // -> насильно переводим в тип с меньшим объемом памяти, соглашаясь потерять точность значения (обрежет)

        doubleVariable = floatVariable;
        floatVariable = (float) doubleVariable;



        int[] myArray = new int[10];
        int[] myArrayFilled = {12, 232, 456, 1, 54, 32, 98, 112};
        Arrays.sort(myArrayFilled); // -> сортирует и перезаписывает
        System.out.println(Arrays.toString(myArrayFilled));
        System.out.println(myArrayFilled[0]);



        String[] names = {"Nikolay", "Alena", "Dima", "Sasha"};
        Arrays.sort(names);
        System.out.println(names); // -> будет "кракозябра"
        System.out.println(names[0]);
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);


        char c = '3';
        char b = 'c';
        int d = 10;

        System.out.println(c + b);




    }
}
