package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        for (int i = iVal; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < iVal; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
