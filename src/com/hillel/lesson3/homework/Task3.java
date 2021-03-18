package com.hillel.lesson3.homework;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*3)   Создать метод, для розыгрыша приза в лотерее среди участников.
        Внутри метода сделать возможным каждый раз при вызове вводить количество участников
        (При запуске программы должно спрашивать количество участников(использовать Scanner),
        вы задаете количество участников и среди них производится розыгрыш).
        Используя класс Random определить победителя и вывести поздравление в консоль.

        У данного метода не будет принимаемых параметров и может быть, может не быть
        возвращаемый параметр с результатом победителя(зависит от того как вы реализуете).*/

        Scanner sc = new Scanner(System.in);
        System.out.print("How many players today? Please enter: ");
        int quantity = sc.nextInt();
        quantity = checkIfCorrect(quantity, sc);
        sc.close();
        lottery(quantity);
    }

    private static int checkIfCorrect(int digit, Scanner scan) {
        while (digit <= 0){
            System.out.print("Incorrect value. It can`t be 0 or less. Enter correct quantity: ");
            digit = scan.nextInt();
        }
        return digit;
    }

    private static void lottery (int quantityOfPlayers){
        Random randomWinner = new Random();
        int winner = randomWinner.nextInt(quantityOfPlayers) + 1;
        System.out.println("Winner is player #" + winner);
    }

}
