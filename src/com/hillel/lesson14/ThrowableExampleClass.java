package com.hillel.lesson14;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThrowableExampleClass {
    public static void main(String[] args) {
/*
        int a = 4;
        int b = 2;
        int c = 0;

        List<String>myArrayList = new ArrayList<>();
        myArrayList.add("firstElement");

        try {
            Scanner scanner = new Scanner(System.in);
            scanner.close();
            String someLine = scanner.nextLine();
            File file = new File("C://error_file.txt");

            int result = a/b;
//            String myArrayListElement = myArrayList.get(11);
            String myArrayListElement = myArrayList.get(8);
            int error_result = b/c;
//            int error_result = 6;
            System.out.println(myArrayListElement + result + error_result);
        } catch (IndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Exception is caught: ".concat(e.toString()));
        } catch (Exception e){
            System.out.println("exception is caught");
        }*/
        try {
            getException();
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }

    }

    static private void getException(){

        int a = 4;
        int b = 2;
        int c = 0;

        List<String>myArrayList = new ArrayList<>();
        myArrayList.add("firstElement");

        try {
            Scanner scanner = new Scanner(System.in);
            scanner.close();
            String someLine = scanner.nextLine();
            File file = new File("C://error_file.txt");

            int result = a/b;
//            String myArrayListElement = myArrayList.get(11);
            String myArrayListElement = myArrayList.get(8);
            int error_result = b/c;
//            int error_result = 6;
            System.out.println(myArrayListElement + result + error_result);
        } catch (IndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Exception is caught: ".concat(e.toString()));
        } catch (Exception e){
            System.out.println("exception is caught");
        }

       /* try {
            throw new MyCustomException();
        } catch (Exception e){

        }*/

        throw new MyCustomException();

    }
}