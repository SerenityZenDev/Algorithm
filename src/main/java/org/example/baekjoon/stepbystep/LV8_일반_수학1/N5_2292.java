package org.example.baekjoon.stepbystep.LV8_일반_수학1;

import java.util.Scanner;

public class N5_2292 {
    /*
    1         : 1   : 0
    2 ~ 7     : 6   : 1
    8 ~ 19    : 12  : 2
    20 ~ 37   : 18  : 3
    38 ~ 61   : 24  : 4
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();

        long now = 1L;
        int plus = 1;
        int count = 0;

        while(n > now){
            now += 6L * plus++;
            count++;
        }

        System.out.println(count + 1);
    }
}
