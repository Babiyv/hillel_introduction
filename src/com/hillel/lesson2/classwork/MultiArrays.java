package com.hillel.lesson2.classwork;

import java.util.Arrays;

public class MultiArrays {
    public static void main(String[] args) {

        int[][] myMatrixArray = new int[3][3];
        int[][] myMatrixArrayFilled = {{1, 2}, {3, 4}} ;

        System.out.println(myMatrixArrayFilled); // ->
        System.out.println(myMatrixArrayFilled); // ->
        System.out.println(Arrays.toString(myMatrixArray)); // ->

        System.out.println(Arrays.deepToString(myMatrixArray));
        System.out.println(Arrays.deepToString(myMatrixArrayFilled));



    }
}
