package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1274_Divide2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        int factors = 0;
        for (int i = 2; i <= iVal/2; i++) {
            if (iVal % i == 0) factors++;
        }
        System.out.println(factors == 0 ? "prime" : "not prime");
    }
}
