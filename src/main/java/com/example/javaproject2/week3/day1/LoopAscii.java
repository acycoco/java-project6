package com.example.javaproject2.week3.day1;

public class LoopAscii {
    public static void main(String[] args) {
        for (int c = 65; c <='Z'; c++) { //char c = 65;는 안됨
            System.out.printf("%d:%c ", c, c);
        }
    }
}
