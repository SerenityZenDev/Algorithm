package org.example.baekjoon.stepbystep.LV15_약수_배수와_소수_2;

import java.util.Scanner;

/*
 입력값 : 9
 0 - 0 0 0 0 0 0 0 0 0
 1 - 1 = 1
 2 - 1 0 = 1
 3 - 1 0 0 = 1
 4 - 1 0 0 1  = 2
 5 - 1 0 0 1 0 = 2
 6 - 1 0 0 1 0 0 = 2
 7 - 1 0 0 1 0 0 0 = 2
 8 - 1 0 0 1 0 0 0 0 = 2
 9 - 1 0 0 1 0 0 0 0 1 = 3
 1 - 4 - 9 - 25
 */
public class Q9_13909 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        for (int i = 1; i * i <= N; i++) {
            count++;
        }

        System.out.println(count);
    }
}
