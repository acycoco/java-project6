package com.example.javaproject2.week2.day4;

public class SecretMap {

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];;
        String temp;
        for (int i = 0; i < n; i++){
            temp = Integer.toBinaryString(arr1[i] | arr2[i]); //toBinaryString은 이진수로 변환하는 과정에서 바로 문자열로 바꾸기 때문에 자릿수가 모자랄 수 있어서 format을 추가해줘야된다.
            answer[i] = String.format("%" + n + "s", temp).replace("0"," ").replace("1","#");

        }


        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        solution(5, arr1, arr2);

    }

}

