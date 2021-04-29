package com.hillel.lesson12;

import java.time.LocalTime;
import java.util.*;

import static javax.swing.UIManager.get;

public class ClassWork12_List {
    public static void main(String[] args) {

        List <String> myList = new ArrayList<>();

        myList.add("name1"); // - добавить элемент в список;
        myList.add("name2");
        myList.add("name3");
        myList.add("name4");
        myList.add("name5");
        myList.add(0,"name8"); // - добавить жлемент в список по индексу;

        boolean aa2 = myList.contains("name3"); // - проверить наличие элемента в списке;
        boolean bb2 = myList.contains("name9");
        System.out.println("aa2: " + aa2 + ". bb2: " + bb2);

        System.out.println(myList);

        String arrayElement_2 = myList.get(2); // - получить элемент по индексу;
        System.out.println(arrayElement_2);

        myList.set(2, "Updated name 3"); // - ЗАМЕНИТЬ элемент в список по индексу;
        System.out.println(myList.get(2));

        int myListSize = myList.size(); // - узнать размер списка (но не заполненность);
        System.out.println("myListSize is: " + myListSize);


//        myList.isEmpty(); // - проверить пустоту списка;
//        myList.remove("1"); // - удалить конкретный элемент в списке по объекту или по индексу (удалять с итератором безопаснее);
//        myList.clear(); // - очистить список;


//        myList.set(4, null);
        System.out.println(myList);

        Iterator<String> iterator = myList.iterator();

        while (iterator.hasNext()) {
//            all classes in Java have super class Object
            String iteratorData2 = iterator.next();
            System.out.println("myList data element: ".concat(iteratorData2));
        }

        for (String a : myList) {
            System.out.println(a);
        }


        List<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("Linked@Data1");
        myLinkedList.add("Linked@Data2");
        myLinkedList.add("Linked@Data3");
        myLinkedList.add("Linked@Data4");
        myLinkedList.add("Linked@Data5");
        System.out.println(myLinkedList);

        myLinkedList.set(2, ".set: updatedData3");
        System.out.println(myLinkedList);

        int myLinkedListSize = myLinkedList.size();
        System.out.println("myLinkedList size is: " + myLinkedListSize);


        List<String> myArrayList = new ArrayList<>();
        Collections.addAll(myArrayList, "1", "2", "3", "4", "5");
        int counter = 10000000;
        int starter = 0;
        LocalTime localTime = LocalTime.now();
        System.out.println("Array list started at: " + localTime.toString());
        while (starter < counter){
            int x = starter++;
            myArrayList.set(3, "updated");
            myArrayList.add(x, String.valueOf(starter));
        }
        System.out.println("Array list ended at: " + LocalTime.now().toString());


        List<String> myLinkedList2 = new LinkedList<>();
        Collections.addAll(myLinkedList2, "1", "2", "3", "4", "5");
        starter = 0;
        System.out.println("Linked list started at: " + LocalTime.now().toString());
        while (starter < counter){
            int x = starter++;
            myLinkedList2.set(3, "updated");
            myLinkedList2.add(x, String.valueOf(starter));
        }
        System.out.println("Linked list ended at: " + LocalTime.now().toString());
        System.out.println("Starter value is: " + starter);


    }
}
