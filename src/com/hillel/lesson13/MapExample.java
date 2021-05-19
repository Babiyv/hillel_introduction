package com.hillel.lesson13;

import java.util.*;

public class MapExample {

//    Map - структура данных которая представляет собой связку ключ значение (ключи ОБЯЗАТЕЛЬНО должны быть уникальны, о само значение внутри ключа может повторяться);
    static Map<String, String> myHashMap = new HashMap<>(); // <String, String> - первым идет дженерик (типизация объекта), а зпосле запятой "ключ значения".
    static Map<String, String> myLinkedHashMap = new LinkedHashMap<>(); // - используем когда нам нужно соблюсти/видеть очередность добавляения. Работает медленее чем просто HashMap.
    static Map<String, String> myTreeMap = new TreeMap<>();

    public static void main(String[] args) {

        String key_1 = "key_1";
        String key_2 = "key_2";
        String key_3 = "key_3";
        String key_4 = "key_4";
        String key_5 = "key_5";
        String key_6 = "a_key_5";

        String country_1 = "Ukraine";
        String country_2 = "Spain";
        String country_3 = "Italy";
        String country_4 = "Canada";
        String country_5 = "Lithia";
        String country_6 = "Jamaica";

        myHashMap.put(key_1, country_1);
        myHashMap.put(key_2, country_2);
        myHashMap.put(key_3, country_3);
        myHashMap.put(key_4, country_4);
        myHashMap.put(key_5, country_5);
        myHashMap.put(key_6, country_6);
        System.out.println("HashMap \n" + myHashMap); // - выведет не упорядочненно и с ключами. Можем получить данный по самому ключу.
        System.out.println("__________________________________________");


        myLinkedHashMap.put(key_1, country_1);
        myLinkedHashMap.put(key_2, country_2);
        myLinkedHashMap.put(key_3, country_3);
        myLinkedHashMap.put(key_4, country_4);
        myLinkedHashMap.put(key_5, country_5);
        myLinkedHashMap.put(key_6, country_6);
        System.out.println("LinkedHashMap \n" + myLinkedHashMap); // - сохранилась очередность добавления;
        System.out.println("__________________________________________");


        myTreeMap.put(key_1, country_1);
        myTreeMap.put(key_2, country_2);
        myTreeMap.put(key_3, country_3);
        myTreeMap.put(key_4, country_4);
        myTreeMap.put(key_5, country_5);
        myTreeMap.put(key_6, country_6);
        System.out.println("TreeMap \n" + myTreeMap); // - сортирует по значению ключа;
        System.out.println("__________________________________________");


//        Тема: итераторы ("курсор")
        String firstValue = myHashMap.get(key_1);

//        #1. for iteration for Map
        for(Map.Entry<String, String> entry : myHashMap.entrySet()){
            String key = entry.getKey(); // - в данном случае это bad practice и лучше было бы передавать entry.getKey() сразу на консоль (в метод) и таким образоом экономились бы ресурсы памяти;
            String value = entry.getValue();
            System.out.println("Key is: ".concat(key));
            System.out.println("Value is: ".concat(value));
        }

//        #2. while iterator for Map
        Iterator<Map.Entry<String, String>> iterator = myHashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey(); // - в данном случае это bad practice и лучше было бы передавать entry.getKey() сразу на консоль (в метод) и таким образоом экономились бы ресурсы памяти;
            String value = entry.getValue();
            System.out.println("while loop key is: ".concat(key));
            System.out.println("While loop value is: ".concat(value));
        }

//        #3. for each iterator forM Map.
        for (String key : myHashMap.keySet()){
            System.out.println("For each loop key: ".concat(key));
        }
        for (String value : myHashMap.values()){
            System.out.println("For each loop value: ".concat(value));
        }


    }
}
