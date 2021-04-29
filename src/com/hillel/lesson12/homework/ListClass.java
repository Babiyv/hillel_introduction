package com.hillel.lesson12.homework;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
        List<Class2> newArrayList = new ArrayList<>();

        ifListIsEmptyMethod(newArrayList);
        addThreeElementsOfClass2(newArrayList);



    }

    private static List addThreeElementsOfClass2(List listName) {
        for (int i = 0; i < 3; i++) {
            Class2 element2 = new Class2();
            listName.add(0, element2);
        }
        System.out.println("Method \"Add 3 elements of Class2\"");
        System.out.println("Result of this method: ".concat(String.valueOf(listName)));
        return listName;
    }

    private static List ifListIsEmptyMethod(List listName) {
        if (listName.isEmpty()){
            for (int i = 0; i < 6; i++) {
                Class1 element = new Class1();
                listName.add(element);
            }
        }
        System.out.println("Method if list is empty");
        System.out.println("Result of this method: ".concat(String.valueOf(listName)));
        return listName;
    }
}
