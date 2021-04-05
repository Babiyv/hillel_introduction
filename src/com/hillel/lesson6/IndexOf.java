package com.hillel.lesson6;

public class IndexOf {
    public static void main(String[] args) {

        String mySimpleString = new String ("Test");
        System.out.println("String value: "+ mySimpleString);
        int mySimpleStringCharIndexValue = mySimpleString.indexOf("s");
        System.out.println("Index of \"s\" is: " + mySimpleStringCharIndexValue);

    }
}
