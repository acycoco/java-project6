package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1057 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int result = iVal1 == 0 && iVal2 == 0 ? 1 : 0;

        System.out.printf("%d", result);



    }
}
