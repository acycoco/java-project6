package com.example.javaproject2.codeup;

import java.util.Arrays;

public class Codeup1098Oop {
    private int[][] arr;
    private int w;
    private int h;


    public Codeup1098Oop(int w, int h) {
        this.arr = new int[w][h];
        this.w = w;
        this.h = h;

    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("-------------");
    }

    public void setBeam(int l, int d, int x, int y) {

        x--;
        y--;
        if (d == 0) {
            for (int i = 0; i < l; i++) {
                arr[x][y++] = 1;
            }

        } else {
            for (int i = 0; i < l; i++) {
                arr[x++][y] = 1;
            }
        }


    }

    public static void main(String[] args) {
        int rowCnt = 5;
        int colCnt = 5;
        Codeup1098Oop c1098 = new Codeup1098Oop(rowCnt, colCnt);

        c1098.printArr();
        c1098.setBeam(2, 0, 1, 1);
        c1098.printArr();
        c1098.setBeam(3, 1, 2, 3);
        c1098.printArr();
        c1098.setBeam(4, 1, 2, 5);
        c1098.printArr();
    }
}
