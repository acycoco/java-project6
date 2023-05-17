package com.example.javaproject2.week5.day3;

import java.util.Arrays;

public class Stack2 {
    private int[] arr = new int[10000];
    private int top = -1;

    public Stack2() {
    }

    public Stack2(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        this.arr[++top] = value; //top을 가장 마지막에 들어온 값으로 설정함. 초기값이 -1.
        System.out.println(Arrays.toString(arr));
        System.out.println(top);
    }

    public int pop() {
        if (isEmpty()){
           throw new RuntimeException("스택이 비었습니다.");
        }
        return this.arr[top--];
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public int peek(){
        if (isEmpty()){
            throw new RuntimeException("스택이 비었습니다.");
        }
        return this.arr[top];
    }
    public static void main(String[] args) {
        Stack2 stack1 = new Stack2();
        stack1.push(10);
        stack1.push(20);

        System.out.println(stack1.pop());
        System.out.println(stack1.peek());

    }

}
