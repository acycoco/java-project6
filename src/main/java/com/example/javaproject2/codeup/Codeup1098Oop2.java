package com.example.javaproject2.codeup;

import java.util.Arrays;

public class Codeup1098Oop2 {
    private int[][] arr;
    private boolean printSeparator;
    private int w, h, n, l, d, x, y;

    public Codeup1098Oop2() {
        this.arr = new int[5][5];
        this.printSeparator = true;
    }

    public Codeup1098Oop2(boolean printSeparator) {
        this.arr = new int[5][5];
        this.printSeparator = printSeparator;
    }
    public Codeup1098Oop2(int rowCnt) {
        this.arr = new int[rowCnt][5];
    }
    public Codeup1098Oop2(int rowCnt, int colCnt) {
        this.arr = new int[rowCnt][colCnt];
    }


    public void setBeam(int l, int d, int x, int y) {

        for (int i = 0; i < l; i++) {
            if(d == 0){
                arr[x-1][y+i-1]=1;
            }else {
                arr[x+i-1][y-1]=1;
            }
        }
    }
    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("-------------");
    }

    public static void main(String[] args) {
        int rowCnt = 5;
        int colCnt = 5;
        Codeup1098Oop2 c1098 = new Codeup1098Oop2(rowCnt, colCnt);

        c1098.printArr();
        c1098.setBeam(2, 0, 1, 1);
        c1098.printArr();
        c1098.setBeam(3, 1, 2, 3);
        c1098.printArr();
        c1098.setBeam(4, 1, 2, 5);
        c1098.printArr();
    }
}
