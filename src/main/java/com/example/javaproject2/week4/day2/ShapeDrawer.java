package com.example.javaproject2.week4.day2;

public abstract class ShapeDrawer {


    public void printShape(int height) { //여기는 공통으로 쓰는 거
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }
    public abstract String makeALine(int h, int i);  //여기는 계속 바꿀 수 있음

}
