package com.example.javaproject2.practice;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(4);
        System.out.println( circle.calculateArea());
        circle.display();  //디폴트 메서드
    }
}
