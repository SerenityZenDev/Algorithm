package org.example.baekjoon.stepbystep.LV8_일반_수학1;

import java.util.Scanner;

public class N4_2903 {
    /*
    1 : 3 = 기본값 3으로 시작
    2 : 5
    3 : 9
    4 :
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int row = 3;

        for (int i = 1; i < n; i++) {
            row = 2*row-1;
        }

        System.out.println(row * row);
    }
}
