package com.hillel.lesson10.examplesOnAnimals;

public interface AttackBehavior {

//    просто для примера: автоматически является public static final по умолчанию в интерфейсах
    public static final String test = "ddd"; // пвыделяет сырем, потому что public static final и так уже по умолчанию

    // модификаторы доступа не указываем, потому что с 8-ой джавы все методы интерфейса по умолчанию являются public;
    public void attack(Animal animal);


//    default void attack(Animal animal){ // default methods can`t be overload
    default void attack1(){
        System.out.println("default attack inside interface");
    }
}
