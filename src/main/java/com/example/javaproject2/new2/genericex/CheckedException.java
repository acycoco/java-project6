package com.example.javaproject2.new2.genericex;

import java.time.LocalDate;

public class CheckedException {
    public static void main(String[] args) {
        try{
            throwException();
        } catch (MyException e) {
            Logger
            System.out.println(LocalDate.now()); //언제 발생했는지
            System.out.println(e.getMessage());
        }
    }

    public static void throwException() throws MyException{
        throw new MyException("사용자 정의 예외 발생");
    }//
}
