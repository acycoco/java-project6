package com.example.javaproject2.week2.day3;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].name = "acy";
        students[0].phoneNumber = "010-0000-0200";
        students[0].age = 90;

        students[1] = new Student();
        students[1].name = "heh";
        students[1].phoneNumber = "010-0000-0200";
        students[1].age = 35;



    }
}
