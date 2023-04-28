package com.example.javaproject2.wekk2.day5;

public class ClinicSwitchEx2 {
    public static void main(String[] args) {
        String day = "일";
        String time = "휴진";
        switch (day) {
            case "월", "수", "금": time = "09:00 ~ 18:00"; break;
            case "화", "목": time = "09:00 ~ 20:00"; break;
            case "토": time = "09:00 ~ 13:00"; break;
            case "일": break;

        }
        System.out.printf("%s요일은 %s입니다.", day, time);
    }
}
