package com.example.javaproject2.week5.day4;

public class Bird implements Ani, Shape{


    @Override
    public void makeSound() {
        System.out.println("짹짹");
    }

    @Override
    public void run() {
        System.out.println("뚜르루루");

    }
}
