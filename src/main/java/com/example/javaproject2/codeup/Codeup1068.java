package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1068 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        switch (score / 10) {
            case 10, 9 -> System.out.println("A");
            case 8, 7 -> System.out.println("B");
            case 6, 5, 4 -> System.out.println("C");
            case 3, 2, 1, 0 -> System.out.println("D");
        }


    }
}