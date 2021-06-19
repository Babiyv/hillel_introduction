package com.hillel.lesson10.examplesOnAnimals;

public class Eagle extends Bird implements AttackBehavior, EatBehavior{ // наследоваться можно только от одного класаа, а интерфейсов можно имплементировать сколько угодно

    private String name;

    public Eagle(String animalType, String name) {
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
    public void fly() {
        System.out.println(name + "start to fly");
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                '}';
    }

//    оверайдим методы имплементированных интерфейсов
    @Override
    public void attack(Animal animal) {
        System.out.println(name.concat("start to attack (by interface)").concat(animal.getAnimalType()));
    }

    @Override
    public void eat() {
        System.out.println(name.concat("start to eat (by interface)"));
    }
}
