package com.example.javaproject2.programmers;

import java.util.Arrays;

public class SequenceAndQueries {

    public static int[] solution(int[] arr, int[][] queries) {
        int temp;
        for (int i = 0; i < queries.length; i++) {
            temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] num_list = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
        System.out.println(Arrays.toString(solution(num_list, queries)));
    }
}
