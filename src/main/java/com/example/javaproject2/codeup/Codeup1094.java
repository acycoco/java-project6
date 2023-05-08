package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] name = new int[cnt];


        for (int i = 0; i < name.length; i++) {
            name[i] = sc.nextInt();
        }
        for (int i = name.length - 1; i >= 0; i--) {
            System.out.printf("%d ", name[i]);

        }


    }
}
