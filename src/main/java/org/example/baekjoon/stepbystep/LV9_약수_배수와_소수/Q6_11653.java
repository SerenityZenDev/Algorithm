package org.example.baekjoon.stepbystep.LV9_약수_배수와_소수;

import java.util.Scanner;

public class Q6_11653 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
        if (n != 1) {
            System.out.println(n);
        }
    }

}
