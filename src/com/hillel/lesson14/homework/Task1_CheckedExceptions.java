package com.hillel.lesson14.homework;

import java.io.IOException;

/*Создайте класс, в которому будут 3 отдельных метода, логика которых будет вызывать 3 разные “проверяемые”(checked) ошибки.
Ошибки можете вызвать принудительно в ходе какой-то логики(не принципиально);   */
public class Task1_CheckedExceptions {
    public static void main(String[] args) throws Exception {
        getFirstException();
        getSecondException();
        getThirdException();
    }

    public static void getThirdException() throws Exception {
        try {
            int a = 0;
            int b = 5/a;
        } catch (ArithmeticException  a){ // - просто решил попробовать поиграться
        System.out.println("third exception is working");
        }
    }

    protected static void getSecondException() throws ArrayIndexOutOfBoundsException {
                try {
                    int[] array = new int[1];
                    for (int i = 0; i < 3; i++) {
                        array[i] = 1;
                    }
                } catch (ArrayIndexOutOfBoundsException a){
                    System.out.println("\nsecond exception is working");
                } finally {
                    System.out.println("unfortunately don`t have enough time, but finally from \"getSecondException\" also working fine in anyway \n");
                }
    }

    protected static void getFirstException() throws Exception {
        try {
            int a = 0;
            int b = 0;
            int res = a/b;
        } catch (Exception a){
            System.out.println("first exception is work");
        }
    }

}
