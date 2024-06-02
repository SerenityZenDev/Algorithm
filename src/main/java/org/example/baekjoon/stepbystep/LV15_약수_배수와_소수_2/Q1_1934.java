package org.example.baekjoon.stepbystep.LV15_약수_배수와_소수_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1_1934 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String temp = br.readLine();

            int a = Integer.parseInt(temp.split(" ")[0]);
            int b = Integer.parseInt(temp.split(" ")[1]);

            int c = gcd(a, b);
            System.out.println(a * b / c);
        }
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;

            a = b;
            b = r;
        }
        return a;
    }
}
