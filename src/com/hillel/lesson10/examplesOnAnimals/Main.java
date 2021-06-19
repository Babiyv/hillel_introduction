package com.hillel.lesson10.examplesOnAnimals;

public class Main {
    public static void main(String[] args) {

        Eagle eagle = new Eagle("bird","eagle");
        Shark shark = new Shark("fish","shark");
        Elephant elephant = new Elephant("mammal","elephant");

        eagle.fly();
        shark.swim();
        elephant.run();

        eagle.attack(shark);
        eagle.eat();

        eagle.attack1(); // default method inside interface
        shark.attack1(); // overrided AttackBehavior default method inside class Shark


    }
}
