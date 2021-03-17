package com.hillel.lesson5;

public class SwitchCaseOperator {
    public static void main(String[] args) {

        /*Оператор SwitchCase применяется только для типов данных: byte, short, char, int, String. */

        int month = 3;
        switch (month){
            case 1: // - номер кейса будет сравниваниваться со значением month
                System.out.println("This is January");
                break; // - прекращение после выполнения условия.
            case 2:
                System.out.println("This is February");
                break;
            case 3:
                System.out.println("This is March");
                break;
            case 4:
                System.out.println("This is April");
                break;
            default: // - условие по умолчание, если никакое из условий не совпало
                System.out.println("Unknown month");
                // ставить "break" не обязательно.

        }

    }
}
