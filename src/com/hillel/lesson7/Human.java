package com.hillel.lesson7;

public class Human {

    private String name;

    private int age;

    private String sex;

    private int health;

//      default class constructor:
    /*public Human() {
    }*/

    public Human(String name, int age, String sex, int health) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", health=" + health +
                '}';
    }
}
