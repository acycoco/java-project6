package com.example.javaproject2.programmers;

public class CollatzTest {
    public static int solution(long num) {  //계산 시 int범위를 넘어가서 오류가 나서 long으로 입력을 받아야 됨
        int answer = 0;
        while (num != 1) {
            if (answer == 500) {
                return -1;
            }

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
        }

        return answer;
    }
    public static void main(String[] args) {

        System.out.println(solution(626331));

    }
}
