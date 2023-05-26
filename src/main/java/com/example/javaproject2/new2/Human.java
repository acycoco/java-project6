package com.example.javaproject2.new2;

public interface Human extends Ani, Shape{
    @Override
    void makeSound();

    @Override
    void run();
}
