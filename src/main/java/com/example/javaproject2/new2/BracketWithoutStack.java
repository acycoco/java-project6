package com.example.javaproject2.new2;

public class BracketWithoutStack {
    public static void main(String[] args) {
        String bracktets = "((((())))";
        while( bracktets.indexOf("()") != -1){ //없을 때까지
            bracktets = bracktets.replace("()","");

        }
        System.out.println(bracktets.length() == 0 ? "올바른 괄호입니다.":"올바른 괄호가 아닙니다.");
    }
}
