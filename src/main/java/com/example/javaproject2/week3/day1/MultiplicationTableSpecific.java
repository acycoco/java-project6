package com.example.javaproject2.week3.day1;

public class MultiplicationTableSpecific {
    public static void main(String[] args) {
        int[] dan = {2, 4, 8, 9};
        for (int j = 0; j < dan.length; j++) {
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d * %d = %d\n", dan[j], i, dan[j] * i);
            }
            System.out.println("------------");
        }
    }
}
