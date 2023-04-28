package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1064 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int iVal3 = sc.nextInt();

        int result1 = iVal1 < iVal2 ? iVal1 : iVal2;
        int result2 = iVal2 < iVal3 ? iVal2 : iVal3;


        System.out.printf("%d", result1  < result2 ? result1 : result2);


    }
}