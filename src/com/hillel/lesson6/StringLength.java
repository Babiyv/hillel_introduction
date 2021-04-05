package com.hillel.lesson6;

public class StringLength {
    public static void main(String[] args) {

        String name = "Dima";
        String myNameAndSurname = name + " Laletin";
        System.out.println(myNameAndSurname);

        String myString = new String("My test data String");
        String mySimpleString = new String("Test");

        int myStringLength = myString.length(); // - пробелы тоже считаются символами
        int myTestStringLength = mySimpleString.length();

        System.out.println("My string length is: " + myStringLength);
        System.out.println("My test string length is: " + myTestStringLength);

//        _______________________________ все что писалось в общем классе:

        String firstStringToTestEquals = "My test String";
        String firstStringToTestEquals2 = "My test String";
        String secondStringToTestEquals = "my test string";

        boolean isEqualFirstStringToSecondString = firstStringToTestEquals.equals(secondStringToTestEquals); // - не будут счиатться одинаковыми, так как разный регистр;
        boolean isEqualSecondStringToSameFirstButAnotherObjectString = firstStringToTestEquals.equals(firstStringToTestEquals2);

        boolean isEqualFirstStringToSecondStringIgnoreCase = firstStringToTestEquals.equalsIgnoreCase(firstStringToTestEquals2); // equalsIgnoreCase - игнорирует регистр (большая или маленькая буква);



    }
}
