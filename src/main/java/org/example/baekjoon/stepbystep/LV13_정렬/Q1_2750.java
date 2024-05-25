package org.example.baekjoon.stepbystep.LV13_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_2750 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        // 정렬 메소드
        Arrays.sort(arr);

        for (int val : arr) {
            System.out.println(val);
        }

    }
}
