package com.hillel.lesson14.homework;

/*Создайте еще один класс, у которого будет также три промежуточных метода, которые просто будут вызывать по одному методу первого класса.
Эти методы не должны обрабатывать возможные  ошибки, а просто пробрасывают  полученную  ошибку  выше;*/

import com.hillel.lesson14.MyCustomRuntimeException;

public class Task2_Throw {
    public static void main(String[] args) {
        throw new MyCustomRuntimeException();
    }
}
