package com.example.javaproject2.wekk2.day3;

import java.util.Arrays;

public class SwapEx {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 8, 7, 6};
        int temp = arr[2];
        arr[2] = arr[0];
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
