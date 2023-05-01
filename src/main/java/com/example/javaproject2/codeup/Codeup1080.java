package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        int sum = 0;
        int answer = 0;
        for (int i = 1; sum < iVal; i++) {
            sum += i;
            answer = i;
        }
        System.out.printf("%d\n", answer);
    }
}
