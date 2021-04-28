package com.hillel.lesson10.homework.part2;

public class Student extends Person{
    private String university = "KNU im. Tarasa Shevchenko";
    private int year = 5;


    public Student(Sex sex, int age, String name, String surname) {
        super(sex, age, name, surname);
    }

    public String study() {
      return  String.format("I study at the %s university, on the %d -th year.", university, year);
    }

    @Override
    public String describeYourself() {
        return "I'm responsible, but lazy.";
    }

    @Override
    public String dailyAct() {
        return "I go to the university.";
    }

    @Override
    public boolean isMarried() {
        return false;
    }

    @Override
    public String greeting() {
        return "Hey dude!";
    }

    @Override
    public String toString() {
        return super.toString() + " " + study();
    }
}
