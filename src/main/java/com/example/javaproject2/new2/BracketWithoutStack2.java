package com.example.javaproject2.new2;

public class BracketWithoutStack2 {
    public static void main(String[] args) {
        String bracktets = "((((())))";
        while( bracktets.indexOf("()") != -1){ //없을 때까지
            String[] split = bracktets.split("\\(\\)");
            bracktets = String.join("",split); //무엇을 사이에 두고 join을 할 것인지

        }
        System.out.println(bracktets.length() == 0 ? "올바른 괄호입니다.":"올바른 괄호가 아닙니다.");
    }
}
