package com.hillel.lesson3.homework;

/*6) Создайте свой математический класс(наподобие Math) для помощи в дальнейших вычислениях.
        Внутри нового класса создать 4 новых метода, 2 статических (static) и 2 обычных.
        Этих 4 метода должны выполнять 4 математических операции (сложение(+), вычитание(-), деление(/), умножение(*)).
        Все методы должны возвращать результат выполненной операции обратно.
        Необходимо чтобы 2 метода принимали и возвращали целочисленные значения, а 2 - дробные значения.
        В классе Main реализуйте вызовы созданных Вами новых методов.
        Запомните отличие вызовов статических и не статических методов.*/
public class MathMethodsForTask6 {

    public static int minus (int ... digits){
        int res = digits[0];
        for (int i = 0; i < digits.length - 1; i++){
            res -= digits[i + 1];
        }
        return res;
    }

    public static int sum (int ... digits){
        int res = 0;
        for (int i : digits){
            res += i;
        }
        return res;
    }

     public int divide (int i1, int i2){
        return i1 / i2;
     }

     public int multiplication (int ... digits){
        int res = 1;
        for (int i : digits){
            res *= i;
        }
        return res;
     }

}
