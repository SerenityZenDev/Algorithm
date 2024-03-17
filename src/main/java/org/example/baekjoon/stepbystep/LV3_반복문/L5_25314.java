package org.example.baekjoon.stepbystep.LV3_반복문;

import java.util.Scanner;

public class L5_25314 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = n/4;
        for (int i = 0; i < count; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
