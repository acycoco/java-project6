package com.example.javaproject2.programmers;

public class ManuplateNumbers {
    public static String solution(int[] numLog) {
        String answer = "";
        int control;
        for (int i = 0; i < numLog.length - 1; i++) {
            control = numLog[i + 1] - numLog[i];
            switch (control) {
                case 1 -> answer += "w";
                case -1 -> answer += "s";
                case 10 -> answer += "d";
                case -10 -> answer += "a";
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution(numLog));
    }
}
