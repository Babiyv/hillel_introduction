package com.hillel.lesson4;

import java.util.SplittableRandom;

public class Cycles {

    public static void main(String[] args) {

        int a = 100;
        int b = 500;

//        simple cycle with "while" operator:
        while (a < b) {
            System.out.println("Cycle operation \"while\" starting");
            a = a + 100;
            System.out.println("a value: " + a);
        }

        String myName = "Dima";
        String friendName_Dima = "Dima";
        String friendName = "Igor";

        while (myName.equals(friendName_Dima)){
            friendName_Dima = friendName;
            System.out.println("friendName_Dima value: " + friendName_Dima);
        }

//        "do while" example:
        int x = 1;
        int y = 50;

        do {
            System.out.println("x value is: " + x);
            System.out.println("y value is: " + y);
            System.out.println("first cycle starting");
            y = y - 5;
            System.out.println("first cycle ending");
        } while (x < y); /* {
            System.out.println("first cycle starting");
            y = y - 5;
            System.out.println("first cycle ending");
        } */

//        compare "while" and "do while":
        int firstVariable = 1;
        int secondVariable = 2;

        while (firstVariable == secondVariable){
            System.out.println("never will be performed");
        }

        do {
            System.out.printf("will be performed because that block started before operation while");
        } while (firstVariable == secondVariable);


//        "for" cycles:
        int z = 25;
        int h = 1;

        for (h = 0; h < z; h++) {
            System.out.println("starting cycle iteration");
            System.out.println("h value is: " + h);
        }

        int[] myDigits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int myDigitsLength = myDigits.length;
        for (int xx = 0; xx < myDigits.length - 1; xx++) {
            System.out.println(myDigits[xx]);
        }

        for (int xx = 0; xx < myDigits.length;){
            int myDigitsVariable = myDigits[xx];
            xx++;
            System.out.println(myDigitsVariable);
        }

    }
}
