package com.example.javaproject2.week3.day1;

public class MultiplicationTableMethod {
    public static void printDan(int dan) {

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);
        }
        System.out.println("------------");

    }

    public static void main(String[] args) {
        printDan(2);
        printDan(4);
    }
}
