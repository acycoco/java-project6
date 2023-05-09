package com.example.javaproject2.week4.day2;

public class PyramidStarMakeALine {

    private String spaceChar = "0";

    public PyramidStarMakeALine(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public String makeALine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(i * 2 + 1));
    }
    public void printPyramidWithSpaceChar(int height) {
        for (int i = 0; i < height; i++) {
            System.out.printf(makeALine(height, i));
        }
    }

    public static void main(String[] args) {

        PyramidStarMakeALine pyramidStar = new PyramidStarMakeALine(" ");
        PyramidStarMakeALine pyramidStarZero = new PyramidStarMakeALine("0");
        pyramidStar.printPyramidWithSpaceChar(4);
        pyramidStarZero.printPyramidWithSpaceChar(4);

    }
}
