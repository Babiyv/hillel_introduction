package com.hillel.lesson2.classwork;

import java.util.Arrays;

public class MethodBinarySearch {
    public static void main(String[] args) {

        int[] myArrayFilled = {12, 232, 456, 1, 54, 32, 98, 112};
        Arrays.binarySearch(myArrayFilled, 54);
        Arrays.binarySearch(myArrayFilled, 200);

        System.out.println(Arrays.binarySearch(myArrayFilled, 54));
        System.out.println(Arrays.binarySearch(myArrayFilled, 200));


    }
}
