package com.example.javaproject2.week3.day1;

class Solution2 {
    public int solution(int[] num_list) {
        int answer = 0;
        int even = 0;
        int odd = 0;
        for(int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 != 0) {
                odd *= 10;
                odd += odd;

            } else {
                even *= 10;
                even += even;
            }
        }
        answer = even + odd;
        return answer;
    }
}
public class PrintSequenceIntNotString {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] num_list = {3, 4, 5, 2, 1};
        System.out.println(solution2.solution(num_list));

    }
}
