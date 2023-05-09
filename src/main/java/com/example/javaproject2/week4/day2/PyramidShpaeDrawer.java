package com.example.javaproject2.week4.day2;

public class PyramidShpaeDrawer extends ShapeDrawer{
    @Override
    public String makeALine(int h, int i) {  //추상메소드 오버라이딩
        return String.format("%s%s\n", " ".repeat(h - i - 1), "*".repeat(i * 2 + 1));
    }
}
