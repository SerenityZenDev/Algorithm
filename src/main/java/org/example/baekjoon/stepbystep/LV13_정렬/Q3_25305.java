package org.example.baekjoon.stepbystep.LV13_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Q3_25305 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int cut = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[size-cut]);
    }
}
