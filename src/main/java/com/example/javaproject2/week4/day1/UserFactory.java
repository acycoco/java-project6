package com.example.javaproject2.week4.day1;

public class UserFactory {
    public User getAdultUser() {
        User user = new User();
        user.setAge(33);
        return user;

    }
}
