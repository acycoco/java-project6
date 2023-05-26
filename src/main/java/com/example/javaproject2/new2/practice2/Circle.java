package com.example.javaproject2.new2.practice2;

public class Circle implements Shape{
    private double radius;
    private static final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
