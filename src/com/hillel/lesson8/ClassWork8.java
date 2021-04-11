package com.hillel.lesson8;

public class ClassWork8 {

    static final String GIRL_SEX = "female"; // - константа позволяет скоратить время выполнения программы; константы объявляются(по конвенции) только в аппер-кейсе.

    public static void main(String[] args) {

//        GIRL_SEX = "male"; // - не даст присвоить male, потому что выше мы уже объявили,что это final и присвоили female; (константнта - не изменяемое значение)

        IncapsulationExample incapsulationExample;
        incapsulationExample = new IncapsulationExample(); // - можно было сразу создать в строке выше;
        incapsulationExample.setName("MyName");
        incapsulationExample.setAge(5);
        incapsulationExample.setSex("male");

        System.out.println(incapsulationExample);

        System.out.println("########################################################");

        IncapsulationExample incorrectIncapsulationExample = new IncapsulationExample();
        incorrectIncapsulationExample.setAge(-1);
        incorrectIncapsulationExample.setSex("unknown");

        System.out.println(incorrectIncapsulationExample);

        IncapsulationExample constructorExample = new IncapsulationExample("MyConstructorName");
        System.out.println(constructorExample);

        System.out.println("########################################################");

        IncapsulationExample objectConstructorExample = new IncapsulationExample(constructorExample); // пример конструктора по объэкту (конструктора копирования);
        System.out.println(objectConstructorExample);

        IncapsulationExample girl_1 = new IncapsulationExample("Dina", 18, "female");
        IncapsulationExample girl_2 = new IncapsulationExample("Dina", 18, GIRL_SEX); // - присвоение константного значения ускоряет время выполнения программы, в сравнении с верхней строчкой
        IncapsulationExample girl_3 = new IncapsulationExample("Dina", 18, GIRL_SEX); // - использование константы GIRL_SEX имеет смысл применять если встречается больше 3-х раз и считается best practice


    }
}
