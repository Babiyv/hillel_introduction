package com.hillel.lesson13.homework.task2;

import java.util.*;

/*Задача 2:
Создайте 3 класса, которые линейно наследуются друг от друга.
Должна быть возможность  создать экземпляр класса каждого из наследников (подумайте какой тип класса должен быть).

В каждом из классов должно быть 3 поля(на свое усмотрение), которые имеют тип переменной List/Set/Map,
то есть будут по 1 переменной с типом List, Set и Map.(Зная принципы ООП будьте внимательны реализуя переменные в классах!).

Далее зная проWildcards реализуйте метод, который на вход будет принимать 2 List/Set/Map (На Ваше усмотрение, не принципиально),
один из которых будет разрешать передать всех наследников от среднего  класса(Вашего),
второй - будет разрешать передать всех кто выше в наследовании от среднего класса(Вашего).
Логика внутри данного метода: заполнение из одной коллекции данными в другую коллекцию.*/
public class Class1 {
    static List<List<String>> class1ArrayList = new ArrayList<>();
    static Set<List<String>> class1HashSet = new HashSet<>();
    static Map<String, String> class1TreeMap = new TreeMap<>();

    public static void main(String[] args) {

    }
}
