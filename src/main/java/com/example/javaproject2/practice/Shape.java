package com.example.javaproject2.practice;

public interface Shape {
    double calculateArea();

    default void display(){
        System.out.println("디폴트 메서드");
    }
}
