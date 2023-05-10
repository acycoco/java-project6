package com.example.javaproject2.week4.day3;

public class RightTriangleShapeDrawer extends ShapeDrawer2{

    public RightTriangleShapeDrawer(String symbol) {
        super(symbol);
    }

    @Override
    public String makeALine(int height, int i) {
        return String.format("%s%s\n", "", "*".repeat(i));
    }

    public static void main(String[] args) {
        ShapeDrawer2 rightTriangle = new RightTriangleShapeDrawer("*");
        rightTriangle.printShape(5);
    }
}
