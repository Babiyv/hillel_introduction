package com.hillel.lesson10.homework.part2;

public abstract class Human implements Personality{
    private Sex sex;
    private int age;

    public Human(Sex sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    public String humanityProps() {
        return String.format("My sex is %s, and I'm %d years old.", sex.getValue(), age);
    }


    @Override
    public String toString() {
        return String.format("%s %s %s", humanityProps(), describeYourself(), dailyAct());
    }
}
