package com.example.javaproject2.week1;

public class Point {
    int x;
    int y;

    boolean isSame(){
        return x==y;
    }

    double getDistance(Point p2){

        int xL = this.x - p2.x;
        int yL = this.y - p2.y;

        double somOfPow = Math.pow(xL, 2) + Math.pow(yL, 2);
        double distance = Math.sqrt(somOfPow);

        return distance;



    }
}
