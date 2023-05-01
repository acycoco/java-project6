package com.example.javaproject2.week2.day5;
import java.util.Scanner;
public class RectangularStar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
