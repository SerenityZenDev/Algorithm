package org.example.baekjoon.stepbystep.LV12_브루스_포트;

import java.util.Scanner;

public class Q6_2839 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();


        if (N == 4 || N == 7) {
            System.out.println(-1);
        }
        else if (N % 5 == 0) {
            System.out.println(N / 5);
        }
        else if (N % 5 == 1 || N % 5 == 3) {
            // 나머지가 1인 경우 ex) 6 -> 3으로 2개 따라서 5로 나눈 몫 + 1
            // 나머지가 3인 경우 ex) 8 -> 5로 1번 3으로 1번 나눈 몫
            System.out.println((N / 5) + 1);
        }
        else if (N % 5 == 2 || N % 5 == 4) {
            // 나머지가 2인 경우 ex) 12 -> 3으로 4번 나눈값 = 2로 나누고 2 더한 값
            // 나머지가 4인 경우 ex) 14 -> 5로 한번 3으로 3번 = 5로 나눈 값 + 2
            System.out.println((N / 5) + 2);
        }
    }
}
