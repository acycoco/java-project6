package com.example.javaproject2.week1;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;
        System.out.println(p1.isSame());

        Point p2 = new Point();
        p2.x = 3;
        p2.y = 4;
        System.out.println(p2.isSame());

        Point p3 = new Point();
        p3.x = 2;
        p3.y = 2;
        System.out.println(p3.isSame());

        System.out.println(p1.getDistance(p2));
    }
}
