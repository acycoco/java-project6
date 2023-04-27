package com.example.javaproject2.wekk2.day4;

public class OrOperatorEx2 {
    public static void main(String[] args) {
        int yearOfExp = 8;
        int numOfProj = 12;

        boolean isPromotion = yearOfExp > 5 || numOfProj > 10;
        System.out.printf("팀장 승진 여부: %b\n", isPromotion);
    }
}
