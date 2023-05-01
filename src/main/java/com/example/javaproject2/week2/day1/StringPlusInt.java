package com.example.javaproject2.week2.day1;

public class StringPlusInt {
    public static void main(String[] args) {
        System.out.println("1" + 1);
        //int result = "1" + 1;   //error

        String result = "1" + 1;
        System.out.println("result =" + result);
        int iResult = Integer.parseInt("1") + 1;
        System.out.println("iResult ="+ iResult);

    }
}
