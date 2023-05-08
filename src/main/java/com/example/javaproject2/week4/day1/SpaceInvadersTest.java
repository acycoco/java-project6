package com.example.javaproject2.week4.day1;

public class SpaceInvadersTest {
    public static void main(String[] args) {
        SpaceInvaders spaceInvaders = new SpaceInvaders();

        spaceInvaders.moveRight();
        System.out.println(spaceInvaders.location);
        spaceInvaders.moveLeft();
        System.out.println(spaceInvaders.location);
    }

}
