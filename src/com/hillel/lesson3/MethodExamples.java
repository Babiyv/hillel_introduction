package com.hillel.lesson3;

public class MethodExamples {
    public static void main(String[] args) {
        String friendMisha = "Misha";
        String friendIgor = "Igor";
        String friendAnna = "Anna";
        String friendZulfia = "Zulfia";

        String companyName = "friendsCompany";

        int friendsQuantity = 9;

        reserveTableForFriends();
        reserveTableForFriends(friendMisha, friendIgor, friendAnna);
        reserveTableForFriends(companyName, friendsQuantity);


        int a = 1;
        int b = 2;
        int c = 3;

        methodTest(a);
        methodTest(a, b);
        methodTest(a, b, c);

    }

    public static void reserveTableForFriends(String...names) {
        System.out.println("table for friends reserved");
    }

    public static void reserveTableForFriends(String friendsCompany, int quantity) {
        System.out.println("table for friends reserved: " + quantity);

    }


    public static void methodTest (int a){
        System.out.println(a);
    }

    public static void methodTest (int a, int b){
        System.out.println(a+b);
    }

    public static void methodTest (int a, int b, int c){
        System.out.println(a*b*c);
    }




}
