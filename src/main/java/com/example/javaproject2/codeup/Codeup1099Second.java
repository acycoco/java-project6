package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1099Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] plate = new int[11][11];

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                plate[i][j] =sc.nextInt();
            }
        }
        int x = 2;
        int y = 2;



        while (x < 10 && y < 10){
            if (plate[x][y] == 2) { //먹이 발견
                plate[x][y] = 9;
                break;
            }
            plate[x][y] = 9; //해당 자리를 9로
            if (plate[x][++y] == 1) { //오른쪽으로 막힌 경우
                y--; //다시 원래 위치로
                if (plate[++x][y] == 1) { //아래쪽으로 막힌 경우
                    break; //그럼 최종적으로 막힘
                }
            }
        }


        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d ", plate[i][j]);
            }
            System.out.println();
        }

    }
}
