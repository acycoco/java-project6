package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] name = new int[cnt];
        int min;

        for (int i = 0; i < name.length; i++) {
            name[i] = sc.nextInt();

        }
        min = name[0];
        for (int i = 0; i < name.length; i++) {
            if (min > name[i]) min = name[i];
        }
        System.out.printf("%d ", min);


    }
}
