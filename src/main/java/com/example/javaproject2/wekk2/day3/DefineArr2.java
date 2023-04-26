package com.example.javaproject2.wekk2.day3;

import java.util.Arrays;

public class DefineArr2 {
    public static void main(String[] args) {
        int[] iArr = new int[]{1, 2, 3, 8};

        int[][] arr2 = {
                {10, 20, 30},
                {40, 50, 60},
                {40, 50, 60}
        };

        System.out.println(Arrays.toString(arr2[0]));
        System.out.println(Arrays.toString(arr2[1]));
        System.out.println(Arrays.toString(arr2[2]));

        System.out.println(arr2[0][0]);
        System.out.println(arr2[0][1]);



    }
}
