package com.example.javaproject2.new2.genericex;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Box<Integer> box = new Box<>(); //int는 안됨 wrapper 클래스만 됨
        box.setItem(10);


        Box<String> strBox = new Box<>();
        strBox.setItem("2");//타입을 고정시킬 수 있는 장점


        List<Integer> strList = new ArrayList<>();
        strList.add(1);
        strList.add(2);
        String firstOption = String.valueOf(getFirstItem(strList));
    }

    public static <T> T getFirstItem(List<T> list){
        if (list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
}
