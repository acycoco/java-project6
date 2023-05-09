package com.example.javaproject2.week4.day2;

public class DiEx {
    private ShapeDrawer shapeDrawer;
    public DiEx(ShapeDrawer shapeDrawer) {
        this.shapeDrawer = shapeDrawer;
    }
    /*private ParallelogramShapeDrawer parallelogramShapeDrawer;

    public DiEx(ParallelogramShapeDrawer parallelogramShapeDrawer) {
        this.parallelogramShapeDrawer = parallelogramShapeDrawer;
    }*///ParallelogramShapeDrawer (자식 클래스) 로 선언 했기 때문에 ParallelogramShapeDrawer 만 받을 수 있음.

    public void doSth() {
        shapeDrawer.printShape(5);
    }
    //DiEx라는 클래스에서 ShapeDrawer을 사용(의존 depends)합니다.
}
