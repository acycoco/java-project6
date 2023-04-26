package com.example.javaproject2.wekk2.day3;

import java.util.Arrays;

public class TwoDimArrFillow {
    public static void printTDimArr(int[][] arr) {
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
        System.out.println("----------");
    }

    public static void fillARow(int rowNum, int[][] arr){
        arr[rowNum][0] = 1;
        arr[rowNum][1] = 1;
        arr[rowNum][2] = 1;
        arr[rowNum][3] = 1;
        arr[rowNum][4] = 1;
        printTDimArr(arr);

    }
    public static void main(String[] args) {
        int[][] iArr = new int[5][5];


        fillARow(1, iArr);
        fillARow(2, iArr);

    }
}
