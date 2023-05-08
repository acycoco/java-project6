package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            a += d;

        }
        System.out.printf("%d ",a);


    }
}
