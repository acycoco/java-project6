package com.example.javaproject2.week4.day1;

public class User {

    private String name;
    private String phoneNumber;
    private int age;
    private String password; //getter을 만들지 않는 방법으로 보호합니다.

    public User() {
    }

    public User(String name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        //접근제어로직
        return password;
    }

    public void setPassword(String password) {
        //본인확인로직
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    boolean isAdult(){
        return age >= 18;
    }
}
