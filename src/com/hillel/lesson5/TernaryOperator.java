package com.hillel.lesson5;

public class TernaryOperator {
    public static void main(String[] args) {

        int a = 10;
        int b = 100;

//        if a < b is true("?") x = 15 if it is false(:) x = 30
        int x = (a < b) ? 15 : 30; // -> "?" - если "true"; ":" - если "false".
        System.out.println(x);


    }
}
