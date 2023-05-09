package com.example.javaproject2.week4.day2;

import com.example.javaproject2.week4.day2.PrintStarUtils;

public class CallStaticMethod {
    public static void main(String[] args) {
        int h = 4;
        for (int i = 0; i < h; i++) {
            String line = PrintStarUtils.makePyramidLine(h, i); //new 없이 호출 가능
            System.out.print(line);
        }
    }

}
