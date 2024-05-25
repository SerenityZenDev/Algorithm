package org.example.baekjoon.stepbystep.LV13_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_2587 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        for (int n = 0; n < 5; n++) {
            int in = input.nextInt();
            arr[n] = in;
            sum += in;
        }

        Arrays.sort(arr);

        System.out.println(sum / 5);
        System.out.println(arr[2]);
    }
}
