package com.example.javaproject2.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("Hello");
        l1.add(1);
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());
       // l1.remove(0);  //array의 경우는 0으로 초기화하는 방법밖에 없는데 ArrayList는 있음
       // l1.remove(0);
        System.out.println(l1.isEmpty());

        for(var item: l1){     //for each, iterator
            System.out.println(item);
        }
    }
}
