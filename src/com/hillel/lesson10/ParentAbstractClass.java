package com.hillel.lesson10;

// *от абстрактного метода нельзя сразу создать объект;
public abstract class ParentAbstractClass {

    private String value;

    public abstract void abstractMethod();

    public void notAbstractMethod(){
        System.out.println("I`m not abstract method but inside abstract class");
    }

}
