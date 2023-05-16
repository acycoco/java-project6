package com.example.javaproject2.week5.day2;

import java.util.Arrays;

public class InsertionSort03 {
    public int[] sort(int[] arr, boolean isAscending){


        for (int i = 1; i < arr.length; i++) { //1부터
            for (int j = i; j > 0; j--) { //j는 거꾸로 내려감

                if ((isAscending? arr[j-1] - arr[j] : arr[j] - arr[j-1]) > 0){ //오름차순
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else {
                    break;
                }
            }

        }
        return arr;
    }

    public int[] sort(int[] arr) { //메소드 오버로딩
        return sort(arr, true);
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        InsertionSort03 is3 = new InsertionSort03();
        is3.sort(arr);
        System.out.println(Arrays.toString(arr));
        is3.sort(arr, false);
        System.out.println(Arrays.toString(arr));


    }
}
