package com.example.javaproject2.week5.day3;

import java.util.Stack;

public class InfixToPostfix {

    private String expression;
    private Stack<Character> stack = new Stack<>();


    public InfixToPostfix(String expression) {
        this.expression = expression;
    }

    public String convert() {
        String newExpression = "";

        for (int i = 0; i < this.expression.length(); i++) {


            char newChar = this.expression.charAt(i);
            switch (newChar) {
                case '(' -> stack.push('(');
                case ')' -> {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        newExpression += stack.pop();
                    }
                    stack.pop(); //'('도 pop을 해줘야됨
                }
                case '+', '-', '*', '/', '^' -> { //연산자인 경우

                    if (!stack.isEmpty() && getPriority(stack.peek()) < getPriority(newChar)) { //newChar가 stack의 top보다 우선순위가 높은경우 push를 해줍니다.
                        stack.push(newChar);
                    } else {
                        while (!stack.isEmpty() && getPriority(stack.peek()) >= getPriority(newChar)) { //newChar보다 낮은 우선순위가 나올때 아니면 stack이 비워질때까지 pop
                            newExpression += stack.pop();
                        }
                        stack.push(newChar);
                    }
                }
                default -> newExpression += newChar; //숫자의 경우

            }
        }
        while (!stack.isEmpty()) newExpression += stack.pop(); //마지막으로 stack을 다 비워줍니다.

        return newExpression;
    }


    public int getPriority(char operator) { //연산자의 우선순위를 반환하는 메서드
        switch (operator) {
            case '+', '-':
                return 1;
            case '*', '/':
                return 2;
            case '^':
                return 3;

        }
        return 0;
    }

    public static void main(String[] args) {
        InfixToPostfix itp = new InfixToPostfix("2*(3+4)-1+3");//중위연산자
        System.out.println(itp.convert());

    }
}
