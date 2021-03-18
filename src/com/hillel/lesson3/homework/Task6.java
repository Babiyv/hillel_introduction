package com.hillel.lesson3.homework;

/*6) Создайте свой математический класс(наподобие Math) для помощи в дальнейших вычислениях.
        Внутри нового класса создать 4 новых метода, 2 статических (static) и 2 обычных.
        Этих 4 метода должны выполнять 4 математических операции (сложение(+), вычитание(-), деление(/), умножение(*)).
        Все методы должны возвращать результат выполненной операции обратно.
        Необходимо чтобы 2 метода принимали и возвращали целочисленные значения, а 2 - дробные значения.
        В классе Main реализуйте вызовы созданных Вами новых методов.
        Запомните отличие вызовов статических и не статических методов.*/
public class Task6 {
    public static void main(String[] args) {

        int addition = MathMethodsForTask6.sum(1, 2, 1, 5);
        System.out.println(addition);

        int decreasing = MathMethodsForTask6.minus(3, 2, 1);
        System.out.println(decreasing);

        MathMethodsForTask6 tm = new MathMethodsForTask6();
        int division = tm.divide(8, 4);
        System.out.println("Вызов не статического метода из статического) \nПомню, что говорили о том, что так \"нельзя\", но не понял как иначе нужно было...) \n" + division);

        int multi = tm.multiplication(2, 3, 6);
        System.out.println(multi);

    }
}
