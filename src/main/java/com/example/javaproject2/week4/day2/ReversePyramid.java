package com.example.javaproject2.week4.day2;

public class ReversePyramid {
    private String spaceChar = "0";

    public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public String MakeALine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(2 * (height - i) - 1));
    }
    public String MakeAParallelogramLine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(height));
    }

    public static void main(String[] args) {
        ReversePyramid reversePyramid = new ReversePyramid(" ");
        int height = 5;
        for (int i = 0; i < height; i++) {
            System.out.printf(reversePyramid.MakeAParallelogramLine(height, i));
        }
    }
}
