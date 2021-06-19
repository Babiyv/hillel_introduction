package com.hillel.lesson10;

public class ParentClass_Polymorphism_MethodOverloading {

    private String parentName;

    public ParentClass_Polymorphism_MethodOverloading(String parentName){
        this.parentName = parentName;
    }

    public String getParentName(){
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void printSomethingToConsole(){
        System.out.println("This is parent class");
    }

//    перезагрузка выше метода
    public void printSomethingToConsole(String textToPrint){
        System.out.println("This is parent class.".concat(textToPrint));
    }

    @Override
    public String toString() {
        return "ParentClass{" +
                "parentName='" + parentName + '\'' +
                '}';
    }
}
