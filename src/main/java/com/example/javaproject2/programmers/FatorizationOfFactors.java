package com.example.javaproject2.programmers;

public class FatorizationOfFactors {
    public static int[] solution(int n) {
        int[] answer1 = new int[n ];
        int idx = 0;
        int factor = 0;
        int cnt = 0;
        while (n > 0) {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    n /= i;
                    if (i != factor) {
                        answer1[idx++] = i;
                        factor = i;
                        cnt++;
                    }
                    break;
                }
            }

        }
        int[] answer = new int[cnt];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer1[i];
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
