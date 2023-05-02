package com.example.javaproject2.week3.day2;

import java.time.LocalDateTime;

public class WhileCnt {
    public static void main(String[] args) throws InterruptedException {
        int cnt = 0;
        while(cnt < 11){//조건식만 있는 for문
            System.out.println(cnt++);
        }
        System.out.println(cnt);
    }
}
