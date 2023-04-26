package com.example.javaproject2.wekk2.day3;

import java.util.Arrays;

public class TwoDimArrEx {
    //메소드로 refactoring
    //parameter
    public static void printArray(int[][] arr){
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("----------");
    }
    public static void main(String[] args) {


        int[][] arr = new int[3][3];

        printArray(arr);


        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        printArray(arr);

        arr[1][1] = 5;

        printArray(arr);


    }
}
