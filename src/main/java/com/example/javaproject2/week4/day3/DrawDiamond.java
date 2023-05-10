package com.example.javaproject2.week4.day3;

public class DrawDiamond {
    public static String getReapeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public String makeALine( int h, int i) {
        int pivot = h / 2;
        if (i <= pivot) {
            return String.format("%s%s\n", getReapeatedSymbol("0",pivot - i), getReapeatedSymbol("*",i * 2 + 1));
        } else {
            return String.format("%s%s\n", getReapeatedSymbol("0",i - pivot), getReapeatedSymbol("*",2 * (h - i)-1));
        }
    }

    public void printLine(int h) {
        String[] lines = new String[h];
        for (int i = 0; i < h; i++) {
            System.out.print(makeALine(h, i));
        }
    }
    public static void main(String[] args) {
        int h = 5;
        DrawDiamond dd = new DrawDiamond();
        dd.printLine(h);

    }
}
