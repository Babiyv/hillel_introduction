package com.hillel.lesson10;

public class ClassWork10_Polymorphism_And_Abstract {
    public static void main(String[] args) {

//        Полиморфизм - это возможность применения одноименных методов с одинаковыми или различными наборами параметров в одном классе или в группе классов, связанных отношением наследования.
        ParentClass_Polymorphism_MethodOverloading parentClass = new ParentClass_Polymorphism_MethodOverloading("Parent");
        ChildClass_Polymorphism_Override childClass = new ChildClass_Polymorphism_Override("Child");

        parentClass.printSomethingToConsole();
        childClass.printSomethingToConsole();
        parentClass.printSomethingToConsole("test string to print for parent");
        childClass.printSomethingToConsole("test string via ChildClass from ParentClass"); // перегруженный метод(полиморфизм); сам метод находится в родительском классе

//        ParentAbstractClass parentAbstractClass = new ParentAbstractClass(); // - нельзя создать объект абстрактного класса;
        ChildNotAbstractClass childNotAbstractClass = new ChildNotAbstractClass();

    }
}

