package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        while (true) {
            while (n > 0) {
                answer += n % 10;
                n /= 10;
            }

            if (answer < 10) break;
            n = answer;
            answer = 0;
        }
        System.out.println(answer);
    }
}

