package com.example.javaproject2.week4.day2;

public class MultiplicationTable {
    private String multipleSymbol;

    public MultiplicationTable(String multipleSymbol) {
        this.multipleSymbol = multipleSymbol;
    }

    public void printDan( int dan) {
        for (int i = 1; i <= 9; i++){
            System.out.printf("%d %s %d = %d\n", 2 ,multipleSymbol, i, 2 * i);
        }
        System.out.println("-----------------");
    }
    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable("x");
        mt.printDan(2);
        mt.printDan(3);
        MultiplicationTable mt2 = new MultiplicationTable("*");
        mt2.printDan(5);
        mt2.printDan(7);

    }
}
