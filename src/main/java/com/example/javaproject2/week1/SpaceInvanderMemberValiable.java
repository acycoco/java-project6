package com.example.javaproject2.week1;

public class SpaceInvanderMemberValiable {
    int location; //클래스의 멤버변수

    public void moveLeft() {
        location = location - 1 ;
        System.out.printf("moveLeft: %d\n",location);
    }

    public void moveRight() {
        location = location + 1;
        System.out.printf("moveRight: %d\n",location);
    }

    public static void main(String[] args) {
        SpaceInvanderMemberValiable simv = new SpaceInvanderMemberValiable();
        simv.moveLeft();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();

    }
}
