package com.example.javaproject2.week4.day2;

public class PyramidStarOop {

    private String spaceChar = "0";

    public PyramidStarOop(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public void printPyramid(int height) {
        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(i * 2 + 1));
        }
    }

    public static void main(String[] args) {

        PyramidStarOop pyramidStar = new PyramidStarOop(" ");
        PyramidStarOop pyramidStarZero = new PyramidStarOop("0");
        pyramidStar.printPyramid(4);
        pyramidStarZero.printPyramid(4);

    }
}
