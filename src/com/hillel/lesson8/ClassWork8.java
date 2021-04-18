package com.hillel.lesson8;

public class ClassWork8 {

    static final String GIRL_SEX = "female"; // - константа позволяет скоратить время выполнения программы; константы объявляются(по конвенции) только в аппер-кейсе.

    public static void main(String[] args) {

//        GIRL_SEX = "male"; // - не даст присвоить male, потому что выше мы уже объявили,что это final и присвоили female; (константнта - не изменяемое значение)

        EncapsulationExample encapsulationExample;
        encapsulationExample = new EncapsulationExample(); // - можно было сразу создать в строке выше;
        encapsulationExample.setName("MyName");
        encapsulationExample.setAge(5);
        encapsulationExample.setSex("male");

        System.out.println(encapsulationExample);

        System.out.println("########################################################");

        EncapsulationExample incorrectEncapsulationExample = new EncapsulationExample();
        incorrectEncapsulationExample.setAge(-1);
        incorrectEncapsulationExample.setSex("unknown");

        System.out.println(incorrectEncapsulationExample);

        EncapsulationExample constructorExample = new EncapsulationExample("MyConstructorName");
        System.out.println(constructorExample);

        System.out.println("########################################################");

        EncapsulationExample objectConstructorExample = new EncapsulationExample(constructorExample); // пример конструктора по объэкту (конструктора копирования);
        System.out.println(objectConstructorExample);

        EncapsulationExample girl_1 = new EncapsulationExample("Dina", 18, "female");
        EncapsulationExample girl_2 = new EncapsulationExample("Dina", 18, GIRL_SEX); // - присвоение константного значения ускоряет время выполнения программы, в сравнении с верхней строчкой
        EncapsulationExample girl_3 = new EncapsulationExample("Dina", 18, GIRL_SEX); // - использование константы GIRL_SEX имеет смысл применять если встречается больше 3-х раз и считается best practice


    }
}
