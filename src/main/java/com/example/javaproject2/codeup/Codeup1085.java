package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long s = sc.nextLong();
        long save = h * b * c * s;

        System.out.printf("%.1f MB\n", save / 8.0 / 1024 / 1024);

    }
}
