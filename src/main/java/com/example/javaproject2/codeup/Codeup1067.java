package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1067 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int iVal1 = sc.nextInt();

        if (iVal1 < 0) {
            System.out.println("minus");
        } else {
            System.out.println("plus");
        }

        if (iVal1 % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }


    }
}