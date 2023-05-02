package com.example.javaproject2.programmers;

import java.util.Arrays;

public class SequenceAndQueries2_1 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1); //answer 배열을 -1로 초기화
        for (int idx = 0; idx < queries.length; idx++) {

            int s = queries[idx][0], e = queries[idx][1], k = queries[idx][1];

            for (int j = s; j <= e; j++) {

                if (arr[j] > k) {
                    answer[idx] = answer[idx] == -1 ? arr[j] : Math.min(answer[idx], arr[j]); //-1이면 arr[j]값을 넣고,아니면 둘 중 최솟값을 넣는다.
                }


            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }
}
