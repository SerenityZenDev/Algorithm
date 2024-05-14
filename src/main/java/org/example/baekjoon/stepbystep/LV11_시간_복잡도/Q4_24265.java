package org.example.baekjoon.stepbystep.LV11_시간_복잡도;

import java.util.Scanner;

public class Q4_24265 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long result = (a * (a-1))/2;

        System.out.println(result);
        System.out.println(2);
    }

}
