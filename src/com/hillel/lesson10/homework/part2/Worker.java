package com.hillel.lesson10.homework.part2;

public class Worker extends Person {
    private String jobTitle = "Software engineer";
    private String company = "Google";

    public Worker(Sex sex, int age, String name, String surname) {
        super(sex, age, name, surname);
    }

    public String work() {
        return String.format("I work as %s in the %s.", jobTitle, company);
    }

    @Override
    public String describeYourself() {
        return "I'm tall, white christian.";
    }

    @Override
    public String dailyAct() {
        return "I write java programs.";
    }

    @Override
    public boolean isMarried() {
        return true;
    }

    @Override
    public String greeting() {
        return "Hi!";
    }

    @Override
    public String toString() {
        return super.toString() + " " + work();
    }
}
