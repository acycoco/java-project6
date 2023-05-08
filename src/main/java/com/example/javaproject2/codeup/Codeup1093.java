package com.example.javaproject2.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] name = new int[23];
        Arrays.fill(name, 0);
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            name[sc.nextInt() - 1]++;

        }

        for (int i = 0; i < name.length; i++) {
            System.out.printf("%d ", name[i]);

        }


    }
}
