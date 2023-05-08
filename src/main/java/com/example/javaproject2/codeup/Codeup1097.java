package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] plate = new int[20][20];

        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                plate[i][j] = sc.nextInt();
            }
        }
        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int xy = plate[x][y];
            for (int j = 1; j < 20; j++) {
                plate[x][j]= plate[x][j] == 1? 0: 1;

            }

            for (int j = 1; j < 20; j++) {

                plate[j][y]= plate[j][y] == 1? 0: 1;
            }

        }

        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                System.out.printf("%d ", plate[i][j]);
            }
            System.out.println();
        }

    }
}
