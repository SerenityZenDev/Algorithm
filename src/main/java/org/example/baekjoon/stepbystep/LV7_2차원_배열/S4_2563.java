package org.example.baekjoon.stepbystep.LV7_2차원_배열;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class S4_2563 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean[][] arr = new boolean[100][100];

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            for (int j = a; j < a + 10; j++) {
                for (int k = b; k < b + 10; k++) {
                    arr[j][k] = true;
                }
            }
        }

        long trueCount = Arrays.stream(arr)
            .flatMapToInt(row -> IntStream.range(0, row.length)
                .filter(i -> row[i])
                .map(i -> 1))
            .sum();

        System.out.println(trueCount);
    }
}
