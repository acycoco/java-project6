package com.example.javaproject2.practice;

public class Circle implements Shape{
    private double radius;
    private static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        return Math.pow(radius,2) * PI;
    }
}
