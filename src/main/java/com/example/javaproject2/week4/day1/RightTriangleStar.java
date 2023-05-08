package com.example.javaproject2.week4.day1;

public class RightTriangleStar {
    public static void main(String[] args) {
        int height = 4;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
