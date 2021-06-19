package com.hillel.lesson10;

// *от абстрактного класса нельзя сразу создать объект;
public abstract class ParentAbstractClass {

    private String value;

    public abstract void abstractMethod(); // абстрактный класс - указываем, что мы хотим чтоб был определенный метод, но саму реализацию(логику) будем прописывать в наследниках

    public void notAbstractMethod(){
        System.out.println("I`m not abstract method but inside abstract class");
    }

}
