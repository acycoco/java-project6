package com.example.javaproject2.week1;

import com.example.javaproject2.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        int iVal = 1;//int라는 뜻
        //System.out.println("iVal = " + iVal); 변수는 초기화를 해야됨
        PrintHello printHello; //변수선언
        printHello = new PrintHello();
        System.out.println(iVal);
        printHello.print();



    }
}
