package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int white = sc.nextInt();
        int[][] plate = new int[19][19];

        for (int i = 0; i < white; i++) {
            plate[sc.nextInt()-1][sc.nextInt()-1] = 1;
        }

        for (int i = 0; i < plate.length; i++) {
            for (int j = 0; j < plate[i].length; j++) {
                System.out.println(plate[i][j]);
            }
        }

    }
}
