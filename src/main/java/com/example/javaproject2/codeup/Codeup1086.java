package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextLong();
        long h = sc.nextLong();
        long b = sc.nextLong();
        long save = w * h * b;

        System.out.printf("%.2f MB\n", save / 8.0 / 1024 / 1024);

    }
}
