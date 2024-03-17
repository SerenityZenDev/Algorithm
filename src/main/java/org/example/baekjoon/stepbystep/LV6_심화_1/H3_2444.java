package org.example.baekjoon.stepbystep.LV6_심화_1;

import java.io.IOException;
import java.util.Scanner;

public class H3_2444 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int maxSize = size * 2 - 1;

        // 중간점을 이전 별찍기
        for (int i = 0; i < size - 1; i++) {
            int blank = size - i - 1;
            int star = 2 * i + 1;

            for (int j = 0; j < blank; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 중간점 별찍기
        for (int i = 0; i < maxSize; i++) {
            System.out.print("*");
        }
        System.out.println();

        // 중간점 이후 별찍기
        for (int i = size - 2; i >= 0; i--) {
            int blank = size - i - 1;
            int star = 2 * i + 1;

            for (int j = 0; j < blank; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
