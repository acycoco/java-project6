package com.example.javaproject2.wekk2.day5;

public class SwitchCaseEx {
    public static void main(String[] args) {
        int dayOfWeek = 2;
        switch (dayOfWeek) {
            case 1:
                System.out.println("월요일");
               // break;
            case 2:
                System.out.println("화요일");
               // break;
            case 3:
                System.out.println("수요일");
            default:
                System.out.println("해당 숫자에 해당하는 숫자가 없습니다.");
        }
    }
}
