package org.example.baekjoon.stepbystep.LV1_입출력과_사칙연산;

import java.util.Scanner;

public class I10_2588 {

    static final int DIGIT = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int temp = b;

        for (int i=0; i<DIGIT; i++){
            System.out.println(a * (temp%10));
            temp = temp/10;
        }
        System.out.println(a*b);
    }
}
