package com.example.javaproject2.week3.day1;

public class NewSwitchCaseClinic {
    public static void main(String[] args) {
        String day = "수";

        String time = switch (day) {
            case "월", "화", "목", "금" -> "09:30 ~ 18:30";
            case "토" -> "09:30 ~ 13:00";
            case "수", "일" -> "휴진";
            default -> throw new IllegalArgumentException("해당 요일은 없습니다.");

        };
        System.out.printf("%s요일은 %s입니다.", day, time);
    }
}
