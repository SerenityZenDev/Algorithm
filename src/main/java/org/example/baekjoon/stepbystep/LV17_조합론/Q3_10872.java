package org.example.baekjoon.stepbystep.LV17_조합론;

import java.util.Scanner;

public class Q3_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    private static long factorial(int n) {
        long result = 0;
        if (n == 0) {
            result = 1;
        } else {
            result = n * factorial(n - 1);
        }
        return result;
    }
}
