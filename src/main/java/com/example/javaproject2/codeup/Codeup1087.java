package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(sum < iVal){
            sum += i++;
        }
        System.out.println(sum);


    }
}
