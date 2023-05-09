package com.example.javaproject2.week4.day2;


public class PyramidShpaeDrawerTest {
    public static void main(String[] args) {
        ShapeDrawer pyramid = new PyramidShpaeDrawer();
        ShapeDrawer parallelogram = new ParallelogramShapeDrawer();
        pyramid.printShape(5);
        parallelogram.printShape(5);
    }
}