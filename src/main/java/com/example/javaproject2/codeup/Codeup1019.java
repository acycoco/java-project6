package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1019 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        String[] hdm = sc.next().split(".");
        for(String s : hdm)
            System.out.println(s);

        int h = Integer.parseInt(hdm[0]);
        int m = Integer.parseInt(hdm[1]);
        int d = Integer.parseInt(hdm[2]);
        System.out.println(h);
       // System.out.printf("%04d.%02d.%02d", h, m, d);*/


    }
}
