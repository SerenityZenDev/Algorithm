package org.example.baekjoon.stepbystep.LV15_약수_배수와_소수_2;

import java.util.Scanner;

public class Q7_4948 {

    static boolean[] flag;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, nn = 0;
        while (true) {
            n = sc.nextInt();
            if (n == 0) {
                break;
            } else if (n == 1){
                System.out.println(1);
                continue;
            }

            nn = n * 2;
            flag = new boolean[nn];

            makeFlag(flag, nn);
            int result = 0;

            for (int i = n + 1; i < nn; i++) {
                if (!flag[i]) {
                    result++;
                }
            }

            System.out.println(result);
        }


    }

    private static void makeFlag(boolean[] flag, int size) {

        flag[0] = flag[1] = true;
        if (size < 2) return;

        for (int i = 2; i <= Math.sqrt(size); i++) {
            if (flag[i]) {
                continue;
            }
            for (int j = i * i; j < size; j+=i) {
                flag[j] = true;
            }
        }
    }
}
