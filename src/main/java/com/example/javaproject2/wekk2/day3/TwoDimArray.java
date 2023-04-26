package com.example.javaproject2.wekk2.day3;

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] iArr = new int[3][3];
        int[] arr0 = iArr[0];
        arr0[0] = 1;
        System.out.println(Arrays.toString(iArr[0]));
        System.out.println(Arrays.toString(iArr[1]));
        System.out.println(Arrays.toString(iArr[2]));


    }
}
