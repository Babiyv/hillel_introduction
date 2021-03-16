package com.hillel.lesson3;

import java.util.Scanner;

public class ScannerClassWork {
    public static void main(String[] args) {

        Scanner scannerText = new Scanner("Summer is coming \n The weather is going to be nice"); // "\n" - передвинуть на след. строку
//        Scanner sc = new Scanner(System.in); // - типичная схема

        String scannerOutput = scannerText.nextLine(); // "nextLine()" - выводит только одну строку и "переходит на следующую
        String scannerOutputSecondLine = scannerText.nextLine();


        System.out.println(scannerOutput);
        System.out.println(scannerOutputSecondLine);

        String myName = keyboardScannerInputString();
        System.out.println(myName);

    }

    private static String keyboardScannerInputString(){
        System.out.println("Enter your name: ");
        Scanner scannerInput = new Scanner(System.in);
        String enteredName = scannerInput.nextLine();
        scannerInput.close();
        return enteredName + ", nice to meet you";
    }

}
