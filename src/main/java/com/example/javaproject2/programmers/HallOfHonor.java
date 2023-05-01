package com.example.javaproject2.programmers;
import java.util.Arrays;

public class HallOfHonor {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int newScore;
        for(int i = 0; i < score.length; i++){
            newScore = score[i];
            for(int j = i-1; j >= 0; j--){
                if (score[j] < newScore) {
                    score[j+1] = score[j];
                    score[j] = newScore;

                }

            }

            if (i < k) {
                answer[i] = score[i];
            }
            else {
                answer[i] = score[k-1];
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] score = {10, 100, 20, 150, 1, 100, 200};

        System.out.println(Arrays.toString(solution(3, score)));
    }

}
