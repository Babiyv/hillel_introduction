package com.hillel.lesson9.homework;

/*·  Далее имея все необходимые классы, зная принцип “динамической диспетчеризации методов” и команду “instanceof”
создайте метод, который будет принимать на вход User(какого-то) и в зависимости от типа вызывать методы:
User = написать строку
Support = написать строку + проверить наличие этой строки в файле
Admin = написать строку + проверить + удалить файл, если такая строка найдена.*/

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static String pathToFile = "C:\\Users\\work\\IdeaProjects\\HillelJavaCourse\\src\\com\\hillel\\lesson9\\homework\\FileForHomework9";
    static final String DEFAULT_COUNTRY = "Ukraine";
    static final boolean IS_MALE = true;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

//        посчитал, что нам были бы ни к чему пустые экземпляры классов, потому сделал возможность создать экземпляр класса только с полными данными (не хватило времени, чтобы сделать красивые фильтры для почты, символов пароля и т.д.)
        User user1 = new User("Vlad", "Babiy", "1234@gmail.com", "0000", IS_MALE, DEFAULT_COUNTRY);
        Support supportUser1 = new Support("Alexander", "541", "541@gmail.com", "541", IS_MALE, DEFAULT_COUNTRY);
        Admin adminUser1 = new Admin("Dmitriy", "Laletin", "dl@gamil.com", "powerOfMind", IS_MALE, DEFAULT_COUNTRY);

        doSomething(user1);
        doSomething(supportUser1);
        doSomething(adminUser1);

        sc.close();
    }

    private static void doSomething (User userIs) throws IOException {
        if (userIs instanceof Support){
            System.out.println("Instance of class Support");
            Support.writeToFileFromConsole(pathToFile, sc);
            Support.lineChecker(pathToFile, sc);
        } else if (userIs instanceof Admin){
            System.out.println("Instance of class Admin");
            Admin.writeToFileFromConsole(pathToFile, sc);
            Admin.deleteIfContains(pathToFile, Support.lineChecker(pathToFile, sc));
        } else {
            System.out.println("Instance of User");
            User.writeToFileFromConsole(pathToFile, sc);
        }
    }
}
