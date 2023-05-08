package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1361 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        for (int i = 0; i < iVal; i++) {
            for (int j = 0; j < i; j++) { //0->0 1->1
                System.out.print(" "); //공백이 그 줄 맨 앞에 출력
            }
            System.out.print("**");
            System.out.println();

        }


    }
}
