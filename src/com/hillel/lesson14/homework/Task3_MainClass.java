package com.hillel.lesson14.homework;
import java.io.*;
import java.nio.channels.ClosedChannelException;

/*Используя методы второго класса(промежуточного), в классе Main реализуйте методы использования следующих конструкций обработки ошибок:
а) try-catch-finally;
б) try-catch-catch-finally;
в) try-catch-catch-catch-finally;
г) try(with resources)-catch-finally;
д) try-finally
* (в каждой конструкции try должны быть
вызовы 3х методов промежуточного класса с разными ошибками).*/

public class Task3_MainClass extends Exception {
        public static void main(String[] args) throws Exception {
            getFirstException();
            getSecondException();
            getThirdException();
            exceptionWithResources();
            exceptionTryFinally();
        }

    private static void exceptionTryFinally() {
            try {
                System.out.println("Nothing logic");;
            } finally {
                System.out.println("No logic - no caught. Only sout and finally. Only hardcore.\n#5 Try-finally is done");
            }
    }

    private static void exceptionWithResources() {
            try (FileReader fileReader = new FileReader("FantasyFile")){
                System.out.println("Some logic that I can`t create now");
            } catch (IOException e) {
                System.out.println("Caught by IOException");
            } finally {
                System.out.println("#4 Try With Resources is done");
            }
    }

    private static void getThirdException() {
        try {
            Task2.thirdThrowMethod();
        } catch (IOException e) {
            System.out.println("IOException closed in IOException catch");
        } catch (Exception e) {
            System.out.println("IOException closed in Exception catch");
        } catch (Throwable e) {
            System.out.println("IOException closed in Throwable catch");
        } finally {
            System.out.println("#3 Try-catch-catch-catch-finally is done");
        }
    }

        private static void getSecondException() {
            try {
               Task2.secondThrowMethod();
            } catch (ClosedChannelException e) {
                System.out.println("Closed channel problem");
            } catch (Exception e){
                System.out.println("Closed channel problem by Exception");
            } finally {
                System.out.println("#2 Try-catch-catch-finally is done in anyway");
            }
        }

    public static void getFirstException() {
        try {
            Task2.firstThrowMethod();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound Exception");
            System.out.println(e);
        } finally {
            System.out.println("#1 Try-catch-finally is done");
        }
    }
    }
