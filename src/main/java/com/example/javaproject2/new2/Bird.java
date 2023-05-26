package com.example.javaproject2.new2;

public class Bird implements Ani, Shape {


    @Override
    public void makeSound() {
        System.out.println("짹짹");
    }

    @Override
    public void run() {
        System.out.println("뚜르루루");

    }
}
