package com.example.javaproject2.wekk2.day1;

public class DivideIntoTwo {
    public static void main(String[] args) {
        float fOne = 1; //1.0은 double로 돼서 float에 안들어가서 1.0f로 해줘야됨.
        float fTwo = 2;
        System.out.printf("%f\n", fOne + fOne / fTwo); //1.500000
        int iOne = 1;
        int iTwo = 2;
        System.out.printf("%d\n", iOne + iOne / iTwo); //1
        System.out.printf("%d\n", 9 / 2); //4
        System.out.printf("%f\n", 9 / 2.0); //4.500000
    }
}
