package com.hillel.lesson10.examplesOnAnimals;

public abstract class Bird extends Animal{ // - тоже сделали этот класс абстрактным (двойная абстракция)


    public Bird(String animalType) {
        super(animalType);
    }

    public abstract void fly();

}
