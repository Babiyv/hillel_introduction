package com.hillel.lesson10.examplesOnAnimals;

public class Shark extends Fish implements AttackBehavior, EatBehavior{

    private String name;

    public Shark(String animalType, String name) {
        super(animalType);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(name + "start to move");
    }

    @Override
    public void swim() {
        System.out.println(name + "start to swim");
    }

    @Override
    public String toString() {
        return "Shark{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void attack1() {
        System.out.println("not default attack (overrided default method from interface)");
    }

    // оверрайдим методы  имплементируемых интерфейсов
    @Override
    public void attack(Animal animal) {
        System.out.println(name.concat("start to attack (by interface)").concat(animal.getAnimalType()));
    }

    @Override
    public void eat() {
        System.out.println(name.concat("start to eat (by interface)"));
    }
}
