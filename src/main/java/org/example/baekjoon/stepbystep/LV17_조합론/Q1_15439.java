package org.example.baekjoon.stepbystep.LV17_조합론;

import java.util.Scanner;

public class Q1_15439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(0);
        } else {
            System.out.println(n * (n - 1));
        }
    }
}
