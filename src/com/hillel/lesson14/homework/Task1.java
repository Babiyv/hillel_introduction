package com.hillel.lesson14.homework;

import java.io.*;
import java.nio.channels.ClosedChannelException;

/*Создайте класс, в которому будут 3 отдельных метода, логика которых будет вызывать 3 разные “проверяемые”(checked) ошибки.
Ошибки можете вызвать принудительно в ходе какой-то логики(не принципиально);   */

public class Task1 extends Exception {
    public static void main(String[] args) throws Exception {
        getFirstException();
        getSecondException();
        getThirdException();
    }

    public static void getFirstException() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

//    специально решил попробовать селать протектед, чтобы немного поработать дополнительно с модификаторами доступа
    protected static void getSecondException() throws ClosedChannelException {
        throw new ClosedChannelException();
    }

    protected static void getThirdException() throws IOException {
        throw new IOException();
    }
}
