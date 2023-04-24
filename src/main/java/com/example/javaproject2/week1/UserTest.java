package com.example.javaproject2.week1;

public class UserTest {
    public static void main(String[] args) {
        User acy = new User();
        acy.name = "acy";
        acy.phoneNumber = "010-1234-5678";
        acy.age = 80;
        System.out.printf("%s는 성인입니까? %b\n", acy.name, acy.isAdult());

        User u2 = new User();
        u2.name = "gkjw";
        u2.phoneNumber = "010-0000-0000";
        u2.age = 40;
        System.out.printf("%s는 성인입니까? %b\n", u2.name, u2.isAdult());
    }
}
