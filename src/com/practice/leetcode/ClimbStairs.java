package com.practice.leetcode;

public class ClimbStairs {

    public static int climbStairs(int n) {

        int first = 1;
        int second = 1;

        for (int i = 2; i <= n; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }

        return second;
    }
}
