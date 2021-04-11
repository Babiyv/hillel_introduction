package com.hillel.lesson7;

import java.util.Random;

public class Scientist {

    private String name;

    public Scientist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int performResearch(){
        int research = getRandomInt(0, 95);

        if (research == 0){
            System.out.println("Scientist ".concat(name).concat(" did nothing this time!!!"));
        }

        return research;
    }

    private static int getRandomInt(int min, int max){
        Random randomHealthDamage = new Random();
        return randomHealthDamage.ints(min, max)
                .findFirst()
                .getAsInt();
    }

    @Override
    public String toString() {
        return "Scientist{" +
                "name='" + name + '\'' +
                '}';
    }
}
