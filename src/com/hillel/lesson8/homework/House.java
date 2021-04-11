package com.hillel.lesson8.homework;


/*Tasks:
    · Создайте класс House. Заполните Ваш новый дом “мебелью”(подсказка: отдельные классы),
    для примера достаточно до 5 вещей. У каждой вещи также должно быть пару характеристик.

    · Создайте класс с 3 параметрами final. Создайте в нем конструктор по-умолчанию и конструктор со всеми параметрами.
    Создайте для всех полей getter и setter.
        ps: Задание с подвохом. Если что-то заметили, закомментируйте эту  часть кода и напишите комментарий.

    · Создайте новый класс, у которого должно быть 9 переменных (8 примитивов + String);
    Для каждой переменной напишите getter и setter;
    Напишите конструкторы начиная от конструктора по-умолчанию до конструктора с 9 параметрами;*/

public class House {

    static final String MATERIAL = "metal and wood";
    static final String COLOR = "natural dark";
    static final boolean IS_IT_ADJUSTABLE = true; // - заставило явно присвоить какое-то значение;

    public static void main(String[] args) {

//        · Создайте класс House. Заполните Ваш новый дом “мебелью”(подсказка: отдельные классы), для примера достаточно до 5 вещей. У каждой вещи также должно быть пару характеристик.

//        сразу создал и другие классы (Chairs, Bed), для прочих видов мебели, но решил их использовать уже под дальнейшие пункты задачи;
        Table kitchenTable = new Table(2000, 2000);
        Table officeTable = new Table(1500, 1000);
        Table coffeeTable = new Table(20, 30);

        System.out.println("Kitchen table parameters: " + kitchenTable);
        System.out.println("Office table parameters: " + officeTable);
        System.out.println("Coffee table parameters: " + coffeeTable);

        coffeeTable.setWidth(300);
        coffeeTable.setColor("white");
        coffeeTable.setMaterial("plastic");
        System.out.println("\nNow coffeeTable parameters is: " + coffeeTable);


/*       · Создайте класс с 3 параметрами final. Создайте в нем конструктор по-умолчанию и конструктор со всеми параметрами.
           Создайте для всех полей getter и setter.
               ps: Задание с подвохом. Если что-то заметили, закомментируйте эту  часть кода и напишите комментарий.*/

//        сходу кажется, что подвоха два: объявлять константную переменную нужно в аппере кейсе (но это как-то слабый подвох)), объявлять константу нужно не в самом классе объекта, а в главном (иначе не будут работать сетеры).

        Chairs kitchenChair = new Chairs(MATERIAL, COLOR, false);
        Chairs officeChair = new Chairs("leather", COLOR, IS_IT_ADJUSTABLE);
        Chairs coffeeChair = new Chairs(MATERIAL, COLOR, false);

        System.out.println(kitchenChair);
        System.out.println(officeChair);
        System.out.println(coffeeChair);

        officeChair.setMaterial("synthetic mesh");
        officeChair.setColor("dark grey");
        System.out.println("\nAfter changes parameters of our officeChair is: " + officeChair);


        /*    · Создайте новый класс, у которого должно быть 9 переменных (8 примитивов + String);
    Для каждой переменной напишите getter и setter;
    Напишите конструкторы начиная от конструктора по-умолчанию до конструктора с 9 параметрами;*/

//        см.класс Bed

    }
}
