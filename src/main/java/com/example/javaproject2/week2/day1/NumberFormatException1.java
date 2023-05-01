package com.example.javaproject2.week2.day1;

public class NumberFormatException1 {
    public static void main(String[] args) {
        String str = "123ab";
        //int num = Integer.parseInt(str); //runtime error 컴파일은 되는데 런타임 중에 나타나는 에러

        String val1 = "1.5";
        String val2 = "2.5";
        System.out.println(val1 + val2);//1.52.5

        //int result = Integer.parseInt(val1) + Integer.parseInt(val2);//에러
        float result = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println("result = " + result);
    }
}
