package com.example.javaproject2.week4.day2;


class DiExTest {
    public static void main(String[] args) {
        DiEx diEx = new DiEx(new ParallelogramShapeDrawer()); //매개변수가 필요함
        diEx.doSth();
        DiEx diEx2 = new DiEx(new PyramidShpaeDrawer()); //매개변수가 필요함
        diEx2.doSth();

    }

}