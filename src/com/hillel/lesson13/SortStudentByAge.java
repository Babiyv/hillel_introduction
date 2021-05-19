package com.hillel.lesson13;

import java.util.Comparator;

public class SortStudentByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) { // - работает по принципу алгоритма красно-черного дерева, то есть всегда сравнивает по 2 объекта и будет работать даже если общее количество объектов больше.
        return o1.getName().compareTo(o2.getName());
    }
}
