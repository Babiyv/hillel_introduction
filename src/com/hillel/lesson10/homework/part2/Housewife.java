package com.hillel.lesson10.homework.part2;

public class Housewife extends Person {
    private Person husband;
    private Person child;

    public Housewife(Sex sex, int age, String name, String surname, Person husband, Person child) {
        super(sex, age, name, surname);
        this.husband = husband;
        this.child = child;
    }

    public String houseWifeLife() {
       return String.format("I make life better for my husband %s, and child %s", husband.name, child.name);
    }

    @Override
    public String describeYourself() {
        return "I'm pretty blond.";
    }

    @Override
    public String dailyAct() {
        return "I cook and keep house in clean.";
    }

    @Override
    public boolean isMarried() {
        return true;
    }

    @Override
    public String greeting() {
        return "Hello!";
    }

    @Override
    public String toString() {
        return super.toString() + " " + houseWifeLife();
    }
}
