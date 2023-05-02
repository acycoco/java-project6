package com.example.javaproject2.programmers;


import java.util.Arrays;

public class SpecialTwoSeries {

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j =0; j < n; j++) {

                if (i == j) {
                    answer[i][j] = 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(3)));
    }
}
