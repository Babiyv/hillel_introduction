package com.hillel.lesson10.homework.part2;

public class Main {
    public static void main(String[] args) {
        Human john = new Worker(Sex.MALE, 45, "John", "Smith");
        Human bill = new Student(Sex.MALE, 22, "Bill", "Smith");
        Human anna = new Housewife(Sex.FEMALE, 40, "Anna", "Smith", (Person) john, (Person) bill);

        System.out.println(john);
        System.out.println(bill);
        System.out.println(anna);
    }
}
