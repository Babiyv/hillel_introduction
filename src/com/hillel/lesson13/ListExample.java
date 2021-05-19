package com.hillel.lesson13;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> stringArrayList = new ArrayList<>(5);
        List<String> stringArrayList_2 = new ArrayList<>(5);
        List<String> stringArrayList_3 = new ArrayList<>(5);

        // iterator can not be object;
        // List <String> notObject =  new List();

        // codding elements to ArrayList
        stringArrayList.add("name1");
        stringArrayList.add("name2");
        stringArrayList.add("name3");
        stringArrayList.add("name4");
        stringArrayList.add("name5");

        stringArrayList_2.add("name6");
        stringArrayList_2.add("name7");
        stringArrayList_2.add("name8");
        stringArrayList_2.add("name9");
        stringArrayList_2.add("name10");

        stringArrayList_3.add("name4");
        stringArrayList_3.add("name5");

        System.out.println("Before .addAll:");
        System.out.println(stringArrayList);

//        .addAll - добавляет все элементы из другого списка;
        stringArrayList.addAll(stringArrayList_2);
        System.out.println("After .addAll:");
        System.out.println(stringArrayList);

//        .removeAll - удаляет из первого списка все совпадения со второго списка;
        stringArrayList.removeAll(stringArrayList_2);
        System.out.println("After .removeAll:");
        System.out.println(stringArrayList);

//        retainAll - удаляет из первого списка все кроме совпадений со вторым(_3) списком;
        stringArrayList.retainAll(stringArrayList_3);
        System.out.println("After .retainAll:");
        System.out.println(stringArrayList);

    }
}
