package com.example.javaproject2.week5.day1;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort01Comparator {
    Comparator<Integer> comparator;

    public BubbleSort01Comparator(Comparator<Integer> comparator) {
        this.comparator = comparator;
    }

    public int[] sortARound(int[] arr, int until) {
        for (int i = 0; i < until; i++) {  // 1 --> j
            if (comparator.compare(arr[i],arr[i+1])> 0) {
                int temp = arr[i];
                arr[i] = arr[i + 1];

            }
        }
        return arr;
    }

    public int[] sort(int[] arr) {
        for (int j = 1; j <= arr.length; j++) {
            arr = sortARound(arr, arr.length - j - 1);
        }
        return arr;
    }


    public static void main(String[] args) {
        BubbleSort01Comparator bubbleSort02 = new BubbleSort01Comparator((o1, o2) -> o1 - o2); //o1-o2 오름차순 o2 -01 내림차순
        int[] arr = {7, 2, 3, 9, 28, 1};
        arr = bubbleSort02.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
