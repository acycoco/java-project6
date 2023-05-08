package com.example.javaproject2.week4.day1;

public class VariousReturnType3 {
    public static boolean isAdult() {
        return true;
    }

    public static int plus() {
        return 1 + 1;
    }

    public static User getUser() {
        return new User();
    }

    public static void printHello() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {

        boolean isAdult = isAdult();
        int plusResult = plus();
        User user = getUser();
        printHello();

    }
}
