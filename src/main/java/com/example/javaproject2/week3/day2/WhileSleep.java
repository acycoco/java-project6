package com.example.javaproject2.week3.day2;

import java.time.LocalDateTime;

public class WhileSleep {
    public static void main(String[] args) throws InterruptedException {

        while(true){//조건식만 있는 for문
            System.out.println(LocalDateTime.now());
            Thread.sleep(1000);
        }
    }
}
