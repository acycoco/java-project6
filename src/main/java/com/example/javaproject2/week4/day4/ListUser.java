package com.example.javaproject2.week4.day4;

import com.example.javaproject2.week4.day1.User;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        User user1 = new User("김미미","010-4547-4444",17);
        userList.add(user1);
        User user2 = new User("김나나","010-4547-4444",34);
        userList.add(user2);

        for (User user: userList) {
            System.out.printf("%s의 전화번호는 %s입니다.\n", user.getName(), user.getPhoneNumber());

        }
    }
}
