package com.hillel.lesson10.homework.part1;

public class Main {
    public static void main(String[] args) {
        Animal duck = new Duck("Duck", "everywhere");
        Animal penguin = new Penguin("Penguin", "Antarctica");
        Animal kiwi = new Kiwi("Kiwi", "New Zealand");

        System.out.println(duck);
        System.out.println(penguin);
        System.out.println(kiwi);
    }
}
