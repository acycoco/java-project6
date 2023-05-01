package com.example.javaproject2.programmers;

class Solution {
    public int solution(int a, int b, int c) {

        int answer = 0;
        int a1 = a + b + c, a2 = 0, a3 = 0;
        a2 = (int)(a1 * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
        a3 = (int)(a2 * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
        if (a != b && b != c && a != c){
            answer = a1;
        } else if (a == b && b == c && a == c) {
            answer = a3;

        } else {
            answer = a2;
        }

        return answer;
    }
}
public class DiceGame {

    public static void main(String[] args) {
        int a = 5; int b = 3; int c = 3;
        Solution solution = new Solution();solution.solution(a,b,c);


    }
}
