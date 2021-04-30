package com.hillel.lesson12.homework;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*Создайте 3 класса, в каждом из которых будет по одному методу с разным названием
(Остальное не имеет значения);

- Создайте Список(List);

- Создайте метод, который будет принимать и возвращать Список, и проводить с ним следующе
итерации:
а). Если список пустой, добавьте в него 6 объектов 1го Вашего класса;
б). После добавьте в начало списка 3 объекта 2го Вашего класса;
в). После замените последние 3 элемента списка на 3 объекта 3го Вашего
класса;

- Создайте второй метод, который на вход будет принимать Список и возвращать список и
будет выполнять следующую логику: Проверять количество экземпляров класса в принятом Списке
и оставлять только по 2 экземпляра каждого из 3 Ваших классов(то есть, 6 объектов в сумме).*/

public class ListClass {
    public static void main(String[] args) {
//        - Создайте Список(List);
        List<String> newArrayList = new ArrayList<>(); // - просто для иследований по скорости выполнения дальнейшего кода
        List<String> newLinkedList = new LinkedList<>();

//        - Создайте метод, который будет принимать и возвращать Список, и проводить с ним следующе итерации:
        firstMethod(newArrayList); // - проводил иследования по скорости выполнения. В этом раунде ArrayList проиграл 0.042 секунд (в процентном соотношении это очень большая разница);
        firstMethod(newLinkedList);




    }

    private static List firstMethod(List listName) {
        LocalTime localTime = LocalTime.now();
        System.out.println("Method started at: " + localTime.toString());
//        а). Если список пустой, добавьте в него 6 объектов 1го Вашего класса;
        if (listName.isEmpty()){
            System.out.println("Method start because list is empty");
            for (int i = 0; i < 6; i++) {
                Class1 element = new Class1();
                listName.add(element);
            }
            System.out.println("Result after first part of method: ".concat(String.valueOf(listName)));
//            б). После добавьте в начало списка 3 объекта 2го Вашего класса;
            System.out.println("Method \"Add 3 elements of Class2 in the begin of list\"");
            for (int i = 0; i < 3; i++) {
                Class2 element2 = new Class2();
                listName.add(0, element2);
            }
            System.out.println("Result after second part of method: ".concat(String.valueOf(listName)));
//            в). После замените последние 3 элемента списка на 3 объекта 3го Вашего класса;
            System.out.println("Method \"Add 3 elements of Class2 in the begin of list\"");
            for (int i = 0; i < 3; i++) {
                Class3 element3 = new Class3();
                listName.set(listName.size() - i - 1, element3);
            }
            System.out.println("Result after third and last part of method: ".concat(String.valueOf(listName)));
        }
        System.out.println("Method finished at: " + localTime.now().toString());
        return listName;
    }
}
