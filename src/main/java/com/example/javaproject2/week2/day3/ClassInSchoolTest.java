package com.example.javaproject2.week2.day3;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.no = 1;
        classInSchool.teacher = new Teacher();
        classInSchool.teacher.name = "김미미";
        classInSchool.teacher.age = 33;
        classInSchool.teacher.address = "서울시 양천구";
        classInSchool.students = new Student[30];

        System.out.println(classInSchool.teacher.name);
        System.out.println(classInSchool.no);

    }
}
