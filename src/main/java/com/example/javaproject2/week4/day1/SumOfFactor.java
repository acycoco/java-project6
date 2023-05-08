package com.example.javaproject2.week4.day1;

public class SumOfFactor {
    public int sumOfFactors(int num) {
        int sum = 1;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

    public void printResult(int num) {
        System.out.printf("%d의 약수의 합은 %d입니다.\n", num, sumOfFactors(num));
    }
}
