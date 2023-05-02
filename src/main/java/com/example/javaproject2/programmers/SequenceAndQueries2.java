package com.example.javaproject2.programmers;

import java.util.Arrays;

public class SequenceAndQueries2 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int min;
        for (int i = 0; i < queries.length; i++) {
            min = -1;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {

                if (arr[j] > queries[i][2] && (min == -1 || min > arr[j])) {
                    min = arr[j];
                }


            }
            answer[i] = min;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }
}
