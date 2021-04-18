package com.hillel.lesson9;

// Наследование - механизм позволяющий создавать классы на основе другого класса. Используется для упрощения кода (не нужно каждый раз прописывать поведение для всех) и построение иерархии.
public class Classwork9_Extends {
    public static void main(String[] args) {

        Animal animal = new Animal("my animal", 5);

        WildAnimal wildAnimal = new WildAnimal("myWildAnimal", 7);
        System.out.println(animal);
        animal.getAnimalSound();

        Cat cat = new Cat("myCat", 10);
        Animal catAnimal = cat;
        System.out.println(catAnimal);

        Animal myWildAnimal = wildAnimal;
        System.out.println(myWildAnimal);

//        WildAnimal myAnimalFromWildAnimal = (WildAnimal) animal; // - аналогично не явному переопределению
        WildAnimal wildAnimal1 = new WildAnimal("myWildAnimal", 1);


        boolean isAnimalChildOfWildAnimal = animal instanceof WildAnimal; // - instanceof - проверяет является ли один класс наследником от другого;
        boolean isCatChildOfAnimal = cat instanceof Animal;

        if (isAnimalChildOfWildAnimal){
            WildAnimal myAnimalFromWildAnimal = (WildAnimal) animal;
        }
        if (isCatChildOfAnimal){
            Animal animal2 = cat;
        }

        System.out.println(wildAnimal1);


        cat.getAnimalSound();
        System.out.println(cat);
        cat.setAge(11);
        System.out.println(cat);

        Dog dog = new Dog("myDog", 15);
        dog.getAnimalSound();
        System.out.println(dog);
        dog.setAge(16);
        System.out.println(dog);

        System.out.println("now parent class Animal");
        System.out.println(animal);

        cat.play();
        cat.play();
        cat.play();
        cat.play();
        cat.play();

    }
}
