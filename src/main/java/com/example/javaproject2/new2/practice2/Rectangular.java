package com.example.javaproject2.new2.practice2;

public class Rectangular implements Shape {
    private double width;
    private double height;

    public Rectangular(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return (width + height) * 2;
    }
}
