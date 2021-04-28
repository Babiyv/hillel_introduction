package com.hillel.lesson10.homework.part2;

public abstract class Person extends Human {

    protected final String name;
    private final String surname;

    public Person(Sex sex, int age, String name, String surname) {
        super(sex, age);
        this.name = name;
        this.surname = surname;
    }

    public String personalityProps() {
        return String.format("My name is %s, surname - %s.", name, surname);
    }

    @Override
    public String toString() {
        return String.format("%s %s I'm %s married. %s", greeting(), personalityProps(), isMarried() ? "" : "not", super.toString());
    }
}
