package com.hillel.lesson14.homework;

/*Создайте еще один класс, у которого будет также три промежуточных метода, которые просто будут вызывать по одному методу первого класса.
Эти методы не должны обрабатывать возможные  ошибки, а просто пробрасывают  полученную  ошибку  выше;*/

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;

public class Task2 {
    public static void main(String[] args) throws IOException {
        firstThrowMethod();
        secondThrowMethod();
        thirdThrowMethod();
    }

    public static void firstThrowMethod() throws FileNotFoundException {
        Task1.getFirstException();
    }

    protected static void secondThrowMethod() throws ClosedChannelException {
        Task1.getSecondException();
    }

    protected static void thirdThrowMethod() throws IOException {
        Task1.getThirdException();
    }
}
