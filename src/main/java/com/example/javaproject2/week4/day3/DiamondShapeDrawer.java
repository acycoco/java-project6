package com.example.javaproject2.week4.day3;

public class DiamondShapeDrawer extends ShapeDrawer2 {

    public DiamondShapeDrawer(String symbol) {
        super(symbol);
    }

    public static String getReapeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }
    @Override
    public String makeALine(int height, int i) {
        int pivot = height / 2;
        if (i <= pivot) {
            return String.format("%s%s\n", getReapeatedSymbol(symbol,pivot - i), getReapeatedSymbol("*",i * 2 + 1));
        } else {
            return String.format("%s%s\n", getReapeatedSymbol(symbol,i - pivot), getReapeatedSymbol("*",2 * (height - i)-1));
        }

    }

    public static void main(String[] args) {
        ShapeDrawer2 dds = new DiamondShapeDrawer("0");
        dds.printShape(5);
    }
}
