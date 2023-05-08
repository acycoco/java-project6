package com.example.javaproject2.programmers;

import java.util.Arrays;

public class FatorizationOfFactors2 {
    public static int[] solution(int n) {
        int[] arr = new int[n + 1];
        int divisor = 2;
        while (n > 1) {

            if ( n % divisor == 0) {
                arr[divisor] = divisor;  //divisor 위치에 저장하면 중복을 없앨 수 있음
                n /= divisor;
            } else {
                // 12 --> 6 --> 3 인 경우 2로 안나누어 덜어짐
                divisor++;
            }
        }
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) size++;
        }


        int idx = 0;
        int[] answer = new int[size];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) answer[idx++] = arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12)));
    }
}
