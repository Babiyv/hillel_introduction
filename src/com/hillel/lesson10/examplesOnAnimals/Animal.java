package com.hillel.lesson10.examplesOnAnimals;

public abstract class Animal {

    private String animalType;

    public Animal(String animalType) {
        this.animalType = animalType;
    }

    public abstract void move(); // - все животные могут двигаться, но каждое живое по своему, так что простосоздаем как шаблон

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
