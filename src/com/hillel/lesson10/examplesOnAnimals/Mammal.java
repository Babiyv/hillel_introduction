package com.hillel.lesson10.examplesOnAnimals;

public abstract class Mammal extends Animal{ // - тоже сделали этот класс абстрактным (двойная абстракция)

    public Mammal(String animalType) {
        super(animalType);
    }

    public abstract void run();
}
