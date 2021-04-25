package com.hillel.lesson9.homework;

/*Task: (Выполнить одним  решением  задачи без разбиения на пункты)

·  Создайте класс User, у которого будет несколько полей(имя, фамилия, почта, пароль, пол, страна). Соблюдая принципы инкапсуляции реализуйте в нем все необходимые методы/конструкторы для дальнейшей работы.

·  Так же у данного класса должно быть 2 метода:
а). Читать. Принимает текст, ничего не возвращает, выводит сообщение принятое в консоль. Данный метод необходимо задать как “неизменяемый”.
б). Писать. Ничего не принимает, просто считывает текст с клавиатуры и сохраняет введенный текст в файл.

·  Создать 2 Класса-наследника от User: Support & Admin. Данные классы должны быть заданы,
как классы от которых невозможно больше наследоваться. Так же для этих классов необходимо определить
все необходимые базовые методы для дальнейшей работы.

·  У класса Support определить дополнительный метод-проверки строки.
Этот метод должен на вход принимать строку и проверять наличие этой строки в файле.
Обратно возвращать значение “содержит/не содержит”(подумайте какая переменная лучше всего подходит для данного типа)

·  У класса Admin реализовать другой метод-удаления. Данный метод на вход получает значение
“содержит/ не содержит” и в зависимости от этого значения удаляет файл(если содержит).

·  Далее имея все необходимые классы, зная принцип “динамической диспетчеризации методов” и команду “instanceof”
создайте метод, который будет принимать на вход User(какого-то) и в зависимости от типа вызывать методы:
User = написать строку
Support = написать строку + проверить наличие этой строки в файле
Admin = написать строку + проверить + удалить файл, если такая строка найдена.*/

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class User {
    //    ·  Создайте класс User, у которого будет несколько полей(имя, фамилия, почта, пароль, пол, страна).
    private String userName;
    private String userSurname;
    private String userEmail;
    private String userPassword;
    private boolean userSexIsMale;
    private String userCountry;

//     Соблюдая принципы инкапсуляции реализуйте в нем все необходимые методы/конструкторы для дальнейшей работы.

//    public User() { // <- сперва решил создать и конструктор по умолчанию, чтобы могли создавать пустой экземпляр класса, но потом подумал, что нам не нужны пустые экземпляры или с не полными данными.
    public User(String userName, String userSurname, String userEmail, String userPassword, boolean userSexIsMale, String userCountry) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userSexIsMale = userSexIsMale;
        this.userCountry = userCountry;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isUserSexIsMale() {
        return userSexIsMale;
    }

    public void setUserSexIsMale(boolean userSexIsMale) {
        this.userSexIsMale = userSexIsMale;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userSexIsMale=" + userSexIsMale +
                ", userCountry='" + userCountry + '\'' +
                '}';
    }

//   ·  Так же у данного класса должно быть 2 метода:
//    а). Читать. Принимает текст, ничего не возвращает, выводит сообщение принятое в консоль. Данный метод необходимо задать как “неизменяемый”.
    public static void readerUserMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your text: ");
        String inputText = sc.nextLine();
        System.out.println("Your entered text is: \"" + inputText + "\"");
        sc.close();
    }

//    б). Писать. Ничего не принимает, просто считывает текст с клавиатуры и сохраняет введенный текст в файл.
    public static void writeToFileFromConsole(String pathToFile, Scanner sc) throws IOException {
        FileWriter fileWriter = new FileWriter(pathToFile);
//        Scanner sc = new Scanner(System.in); // - (2) решил и вовсе попробовать передавать сканер в сигнанутры методов и потом закрыть все разом в мейновом классе
        System.out.println("Please enter text to write: ");
        fileWriter.write(sc.nextLine());
//        sc.close(); // - (1) пришлось закоментировать ибо иначе, по всей видимости, закрывало потоки раньше чем нужно было и выдавало ошибку;
        fileWriter.close();
    }
}
