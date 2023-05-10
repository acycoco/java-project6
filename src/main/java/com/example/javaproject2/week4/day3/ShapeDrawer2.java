package com.example.javaproject2.week4.day3;

public abstract class ShapeDrawer2 {
    protected String symbol;

    public ShapeDrawer2(String symbol) {
        this.symbol = symbol;
    }

    public abstract String makeALine(int height, int i); //적어도 1개의 추상 메소드가 있는 class 파라미터만 있음
//    {
//        return String.format("%s%s\n", "0".repeat(height - i), "*".repeat(2 * i - 1));
//    }
    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.printf("%s", makeALine(height, i));
        }
    }

}
