package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1025 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        int num = iVal;

        int digits = 0;
        while (iVal > 0) {
            iVal /= 10;
            digits++;
        }

        int[] nums = new int[digits];

        for (int i = digits - 1; i >= 0; i--) {

            nums[i] = i == digits - 1 ? nums[i] = num % 10 : num % 10 * (int) Math.pow(10, digits - 1 - i);
            num /= 10;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("[%d]\n", nums[i]);
        }


    }
}
