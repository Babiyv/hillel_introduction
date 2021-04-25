package com.hillel.lesson9.homework;


/*·  Создать 2 Класса-наследника от User: Support & Admin. Данные классы должны быть заданы,
как классы от которых невозможно больше наследоваться. Так же для этих классов необходимо определить
все необходимые базовые методы для дальнейшей работы.

·  У класса Admin реализовать другой метод-удаления. Данный метод на вход получает значение
“содержит/ не содержит” и в зависимости от этого значения удаляет файл(если содержит).*/

import java.io.File;

public final class Admin extends User {
    public Admin(String userName, String userSurname, String userEmail, String userPassword, boolean userSexIsMale, String userCountry) {
        super(userName, userSurname, userEmail, userPassword, userSexIsMale, userCountry);
    }

    public static void deleteIfContains (String pathToFile, boolean isContains) {
        if (isContains) {
            File file = new File(pathToFile);
            if(file.delete()) {
                System.out.println("File has been deleted...");
            }
        } else {
            System.out.println("File has been NOT deleted because it doesn`t contain checked text");
        }
    }
}
