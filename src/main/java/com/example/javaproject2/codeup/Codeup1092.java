package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();
        int day = 1;
        while (day % d1 != 0 || day % d2 != 0 || day % d3 != 0){
            day++;
        }

        System.out.printf("%d",day);


    }
}
