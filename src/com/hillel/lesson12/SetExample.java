package com.hillel.lesson12;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

//        mySet.addAll(myLinkedList2); // - конвертация листа в сет;

        ObjectExample o1 = new ObjectExample("1");
        ObjectExample o2 = new ObjectExample("2");
        ObjectExample o3 = new ObjectExample("3");
        ObjectExample o4 = new ObjectExample("4");
        ObjectExample o5 = new ObjectExample("5");

        Set<ObjectExample> mySet = new HashSet<>();

        mySet.add(o1);
        mySet.add(o2);
        mySet.add(o3);
        mySet.add(o4);
        mySet.add(o5);
        mySet.add(o5);
        mySet.add(o5);
        mySet.add(o5);
        System.out.println(mySet); // - выводит в другом порядке

        for (ObjectExample objectExample : mySet) {
            System.out.println(objectExample);
        }

    }
}
