package com.hillel.lesson4;

public class IfElseOperations {
    public static void main(String[] args) {

        /*int a = 1;
        int b = 2;
        int c = 3;

        if (c > b) { // -> first check
            System.out.println("first is check");
        } else if (b > a) { // -> second check if first is wrong
            System.out.println("second is check");
        } else { // -> third check if both (first and second) checks is wrong
            System.out.println("always false because 3 > 2 and 2 > 1");
        }*/

        /*String[] cats = {"Kurzik", "Barsik", "Kotik", "Bizik", "Dexter"};
        int catsLength = cats.length;
        for (int a = 0; a < catsLength; a++) {
            String catName = cats[a];
            if (catName.startsWith("K")){
                System.out.println("Cat name starts with char K and his name: " + catName);
            } else if (catName.startsWith("B")) {
                System.out.println("Cat name starts with char B and his name: " + catName);
            } else {
                System.out.println("That`s cat is: " + catName);
            }
        }*/

        String[] cats = {"Kurzik", "Barsik", "Kotik", "Bizik", "Dexter"};
        int catsLength = cats.length;
        for (int a = 0; a < catsLength; a++) {
            String catName = cats[a];

            if ((!catName.startsWith("K") && !catName.startsWith("B"))){ // -> "!" - отрицание, должно стоять перед каждым стрингом, если хотим получить отрицательное значение от результата (инвертирует результат)
                System.out.println(catName + " is found there!");
                break;
            } else if (catName.startsWith("K")){
                System.out.println("Cat name starts with char K and his name: " + catName);
                break;
            } else if (catName.startsWith("B")) {
                System.out.println("Cat name starts with char B and his name: " + catName);
            }


        }

    }
}
