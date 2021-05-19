package com.hillel.lesson13;

import java.util.*;

public class SetExamples {

    static SortStudentByAge sortStudentByAge = new SortStudentByAge(); // - сетим как поле в наш класс, где содержится метод Main;

    static Set<String> myHashSet = new HashSet<>(); // <String> - то что мы указываем в треугольных скобочках называется "типизация объектов" или же дженерик;
    static Set<String> myLinkedHashSet = new LinkedHashSet<>();
    static Set<String> myTreeSet = new TreeSet<>();
    static Set<Integer> myIntTreeSet = new TreeSet<>(); // используется только оболочка (Integer) вместо примитивных типов данных (int);
    static Set<Student> myStudentTreeSet = new TreeSet<>();
    static List<Student> myStudentsArrayList = new ArrayList<>();

    public static void main(String[] args) {

        String name_1 = "Olga";
        String name_2 = "Vova";
        String name_3 = "Ekaterina";
        String name_4 = "Alexandra";
        String name_5 = "Yana";
        String name_6 = "Vova";


        Integer value_1 = 1;
        Integer value_2 = 2;
        Integer value_3 = 3;
        Integer value_4 = 4;
        Integer value_5 = 5;

//        HashSet нельзя положить одинаковый элементы;
//        HashSet кладет элементы рандомно и поэтому нельзя обратится к элементу по индексу;
        System.out.println("HashSet добавляет/выводит элементы рандомно;");
        myHashSet.add(name_1);
        myHashSet.add(name_1); // дубль команды (не сработало);
        myHashSet.add(name_2);
        myHashSet.add(name_3);
        myHashSet.add(name_4);
        myHashSet.add(name_5);
        myHashSet.add(name_6); // дубль ЗНАЧЕНИЯ (не сработало);

        System.out.println(myHashSet);
        System.out.println("_____________________________________");


//        LinkedHashSet работает чуть медленее чем хеш сет, но сохраняет порядок добавления;
        System.out.println("LinkedHashSet сохраняет порядок добавления:");
        myLinkedHashSet.add(name_1);
        myLinkedHashSet.add(name_1); // дубль команды (не сработало);
        myLinkedHashSet.add(name_2);
        myLinkedHashSet.add(name_3);
        myLinkedHashSet.add(name_4);
        myLinkedHashSet.add(name_5);
        myLinkedHashSet.add(name_6); // дубль ЗНАЧЕНИЯ (не сработало);

        System.out.println(myLinkedHashSet);
        System.out.println("_____________________________________");


//        TriSet самый медленный из сетов, но автоматически сортирует;
        System.out.println("TreeSet автоматически сортирует, так как под капотом использует красно-черное древо:");
        myTreeSet.add(name_1);
        myTreeSet.add(name_1); // дубль команды (не сработало);
        myTreeSet.add(name_2);
        myTreeSet.add(name_3);
        myTreeSet.add(name_4);
        myTreeSet.add(name_5);
        myTreeSet.add(name_6); // дубль ЗНАЧЕНИЯ (не сработало);

        System.out.println(myTreeSet);
        System.out.println("_____________________________________");

        System.out.println("myIntTreeSet автоматически сортирует, незваисимо от очередности добавления");
        myIntTreeSet.add(value_3); //автоматически отсортирует;
        myIntTreeSet.add(value_2);
        myIntTreeSet.add(value_1);
        myIntTreeSet.add(value_4);
        myIntTreeSet.add(value_5);

        System.out.println(myIntTreeSet);
        System.out.println("_____________________________________");

//        Тема: компаратор
        Student vlad = new Student("Vlad", 18);
        Student alexandra = new Student("Alexandra", 19);
        Student evgeniy = new Student("Evgeniy", 20);

/*        System.out.println("Custom object(<Student>) sorting");
        myStudentTreeSet.add(vlad);
        myStudentTreeSet.add(alexandra);
        myStudentTreeSet.add(evgeniy);

        System.out.println(myStudentTreeSet);
        System.out.println("_____________________________________");*/


        myStudentsArrayList.add(vlad);
        myStudentsArrayList.add(alexandra);
        myStudentsArrayList.add(evgeniy);

        System.out.println("unsorted myStudentsArrayList");
        System.out.println(myStudentsArrayList);
        System.out.println("_____________________________________");

        System.out.println("start sorting myStudentsArrayList");
        Collections.sort(myStudentsArrayList, sortStudentByAge);
        System.out.println(myStudentsArrayList);
        System.out.println("_____________________________________");

    }
}
