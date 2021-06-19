package com.hillel.lesson10;

public class ChildClass_Polymorphism_Override extends ParentClass_Polymorphism_MethodOverloading {
    public ChildClass_Polymorphism_Override(String parentName) {
        super(parentName); // супер - ссылка на класс родитель
    }

//    Переопределение методов - это методы с одинаковой сигнатурой, с одинаковым набором типов данных возвращаемых значений;
//    пример переопределение метода:
    @Override
    public void printSomethingToConsole() { // - если бы не сделали такой оверрайд, то при вызове в ClassWork10:" childClass.printSomethingToConsole(); -> (выводыило бы на консоль, результат метода из ParentClass) "This is parent class";
        System.out.println("this is ChildClass (override from ParentClass)");
    }
}
