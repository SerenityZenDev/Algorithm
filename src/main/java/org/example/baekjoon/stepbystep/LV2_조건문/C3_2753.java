package org.example.baekjoon.stepbystep.LV2_조건문;

import java.util.Scanner;

public class C3_2753 {
    /*
    윤년의 조건
    1. 연도가 4의 배수 (무조건)
    2. 100의 배수가 아닐 때 OR 400의 배수일 때
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println(1);
                System.exit(0);
            }
        }
        System.out.println(0);

    }
}
