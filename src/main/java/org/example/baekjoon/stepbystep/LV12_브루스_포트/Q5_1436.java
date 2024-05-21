package org.example.baekjoon.stepbystep.LV12_브루스_포트;

import java.util.Scanner;

public class Q5_1436 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int num = 666;
        int count = 1;

        while(count != N) {
            num++;
            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }
}
