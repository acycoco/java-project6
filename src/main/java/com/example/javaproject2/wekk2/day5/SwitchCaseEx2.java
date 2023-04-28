package com.example.javaproject2.wekk2.day5;

public class SwitchCaseEx2 {
    public static void main(String[] args) {
        int dayOfWeek = 2;
        switch (dayOfWeek) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("토요일");
                break;
            case 7:
                System.out.println("일요일");
                break;
            default:
                System.out.println("해당 숫자에 해당하는 숫자가 없습니다.");
        }
    }
}
