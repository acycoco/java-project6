package com.example.javaproject2.week5.day2;

import java.util.Arrays;

public class InsertionSort02 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        for (int i = 1; i < arr.length; i++) { //1부터
            for (int j = i; j > 0; j--) { //j는 거꾸로 내려감
                System.out.printf("%d %d %d\n", i, j-1, j);
                System.out.println(Arrays.toString(arr));
                if (arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else {
                    break;
                }
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
