package com.example.javaproject2.wekk2.day4;

public class NotOperatorEx2 {
    public static void main(String[] args) {
        int userAge = 31;
        boolean isAdult = userAge >= 18;
        System.out.printf("미성년자입니까? %b\n", !isAdult);
    }
}
