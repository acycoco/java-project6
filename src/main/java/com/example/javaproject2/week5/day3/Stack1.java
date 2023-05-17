package com.example.javaproject2.week5.day3;

import java.util.Arrays;

public class Stack1 {
    private int[] arr = new int[10000];
    private int top = 0;

    public Stack1() {
    }

    public Stack1(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        this.arr[top++] = value; //top을 앞으로 들어갈 값으로 설정함. 초기값이 0.
        System.out.println(Arrays.toString(arr));
        System.out.println(top);
    }

    public int pop() {
        if (isEmpty()){
           throw new RuntimeException("스택이 비었습니다.");
        }
        return this.arr[--top];
    }

    public boolean isEmpty(){
        return this.top == 0;
    }

    public int peek(){
        if (isEmpty()){
            throw new RuntimeException("스택이 비었습니다.");
        }
        return this.arr[top - 1];
    }
    public static void main(String[] args) {
        Stack1 stack1 = new Stack1();
        stack1.push(10);
        stack1.push(20);
        System.out.println(stack1.peek());
        System.out.println(stack1.pop());

    }

}
