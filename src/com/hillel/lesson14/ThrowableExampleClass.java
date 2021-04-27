package com.hillel.lesson14;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// throws - "пробрасывать". Предупреждение о том, что может возникнуть какая-то ошибка на этапе коомпиляции файла (напрмиер файл не найден), которую нужно словить либо пробросить дальше.
// throw - команда которая выкидывает либо генерирует ошибку (свою, либо ту, которую программа не подсказывает, но вы хотите выкинуть ее преднамеренно).

public class ThrowableExampleClass {
    public static void main(String[] args) throws Exception{
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

/*
        try {
            getException();
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }*/

        getException();


//        throw new MyCustomRuntimeException(); // - throw + оператор new позволяет кинуть эксепшен;

    }

    static private void getException() throws MyCustomException{ // - throwS - позволяет обезопасить нас(контракт) от того, что может быть ошибка. Которую нужно отловить, либо прокинуть дальше

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
        } finally { // <- либо у нас сработала ошибка, либо у нас отработал весь блок кода в "try" без ошибки - у нас все равно дойдет до и сработает "finally";
            System.out.println("finally block is there !!!");
//            бывает кога нужно сделать и такую вложенную конструкцию в final:
            try {
                int second_wrong_result = 6/8;
            } catch (Exception e) {
                System.out.println("hmm, looks like all is fine...");
            }
            System.out.println("abracadabra");
        }

        System.out.println("End of method !!!");

       /* try {
            throw new MyCustomException();
        } catch (Exception e){

        }*/

//        throw new MyCustomException();

    }
}