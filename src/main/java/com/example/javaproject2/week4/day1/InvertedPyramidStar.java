package com.example.javaproject2.week4.day1;

import java.util.Scanner;

public class InvertedPyramidStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        for (int i = iVal; i > 0; i--) {
            for (int j = 0; j < iVal - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
