package com.example.javaproject2.new2.genericex;

import java.util.*;

public class MapEx {
    public static void main(String[] args) {
        Map<String, List<String>> scores = new HashMap<>();
        List<String> objects = new ArrayList<>();
        scores.put("Alice", objects);


        Queue<String> queue =new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        System.out.println(queue.poll());

    }
}
