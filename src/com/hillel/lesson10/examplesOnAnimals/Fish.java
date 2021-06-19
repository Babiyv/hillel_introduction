package com.hillel.lesson10.examplesOnAnimals;

public abstract class Fish extends Animal{ // - тоже сделали этот класс абстрактным (двойная абстракция)

    public Fish(String animalType) {
        super(animalType);
    }

    public abstract void swim();
}
