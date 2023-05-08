package com.example.javaproject2.programmers;

public class SequecesMake {

    public static boolean isZeroOrFive(int num) {
        while (num > 0) {
            int remainder = num % 10;
            if (remainder % 5 != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 253;
        int cnt = 0;



        for (int i = 5; i <= 555; i++) {
            if(isZeroOrFive(i)) {
                System.out.printf("%d\n", i);
            }

        }
        //int[] answer = {};
        //return answer;
    }
}
