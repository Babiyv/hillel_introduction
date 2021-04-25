package com.hillel.lesson9.homework;

/*·  Создать 2 Класса-наследника от User: Support & Admin. Данные классы должны быть заданы,
как классы от которых невозможно больше наследоваться. Так же для этих классов необходимо определить
все необходимые базовые методы для дальнейшей работы.

·  У класса Support определить дополнительный метод-проверки строки.
Этот метод должен на вход принимать строку и проверять наличие этой строки в файле.
Обратно возвращать значение “содержит/не содержит”(подумайте какая переменная лучше всего подходит для данного типа)*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public final class Support extends User {
    public Support(String userName, String userSurname, String userEmail, String userPassword, boolean userSexIsMale, String userCountry) {
        super(userName, userSurname, userEmail, userPassword, userSexIsMale, userCountry);
    }

    public static boolean lineChecker (String pathToFile) throws IOException {
        FileReader fileReader = new FileReader(pathToFile);
        Scanner sc = new Scanner(fileReader);

        System.out.println("Please enter text that you want to check in file: ");
        String textForChecking = sc.nextLine();

        boolean isContains = false;
        while (sc.hasNextLine()){
            String fileString = sc.nextLine();
            if (fileString.equalsIgnoreCase(textForChecking)){
                isContains = true;
                System.out.println("File contain \"" + textForChecking + "\"");
            } else {
                System.out.println("File NOT contain \"" + textForChecking + "\"");
            }
        }
        sc.close();
        fileReader.close();
        return isContains;
    }


}
