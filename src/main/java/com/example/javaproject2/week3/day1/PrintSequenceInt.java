package com.example.javaproject2.week3.day1;

class Solution1 {
    public int solution(int[] num_list) {
        int answer = 0;
        String sOdd = "";
        String sEven = "";
        for(int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 != 0) {
                sOdd += num_list[i];
            } else {
                sEven += num_list[i];
            }
        }
        answer = Integer.parseInt(sOdd) + Integer.parseInt(sEven);
        return answer;
    }
}
public class PrintSequenceInt {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] num_list = {3, 4, 5, 2, 1};
        System.out.println(solution1.solution(num_list));

    }
}
