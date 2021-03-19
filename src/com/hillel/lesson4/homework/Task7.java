package com.hillel.lesson4.homework;

/*7) Создайте массив из 10 чисел от 1 до 10.
    В одном из циклических операторов пройдетесь по нему и выведете следующие сообщения:
        о Если четное - “{число} - это четно число”
        о Если не четное - “{число} - это число не четное”
    Пример:
        1 - не четное число
        2 - четное число
        3 - не четное число*/
public class Task7 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int j : intArray) {
            if (j % 2 == 0) {
                System.out.println(j + " - четное число");
            } else {
                System.out.println(j + " - НЕ четное число");
            }
        }
//       более привычный аналог верхней записи (пометка для себя):
        /*for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0){
                System.out.println(intArray[i] + " - четное число");
            } else {
                System.out.println(intArray[i] + " - НЕ четное число");
            }
        }*/

    }
}
