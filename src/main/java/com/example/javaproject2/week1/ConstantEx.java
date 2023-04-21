package com.example.javaproject2.week1;

import com.example.javaproject2.PrintHello;

public class ConstantEx {
    public static void main(String[] args) {
        final int iVal;
        iVal = 1;
        System.out.println(iVal);
    }
    final PrintHello printHello = new PrintHello();
}
