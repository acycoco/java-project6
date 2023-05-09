package com.example.javaproject2.week4.day2;

import java.util.Scanner;

public class PyramidStar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();

        for (int i = 0; i < iVal; i++) { //입력한 줄 수
            for (int j = 0; j < iVal - i; j++) { //공백 출력 0 -> 3 1 -> 2 2 -> 1
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) { //별 출력 0 -> 1 1 -> 3 2 -> 5
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
