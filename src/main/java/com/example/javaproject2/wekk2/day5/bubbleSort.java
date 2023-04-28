package com.example.javaproject2.wekk2.day5;

import java.util.Arrays;

public class bubbleSort {
    public static int[] sort(int n, int[] arr) {
        for(int i = n; i > 0; i--) {
            for(int j = 0; j < i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {4, 8, 1, 3, 2};
        sort(5, arr);
        System.out.println(Arrays.toString(arr));

    }
}
