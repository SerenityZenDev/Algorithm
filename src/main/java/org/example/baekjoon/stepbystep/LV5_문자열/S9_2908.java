package org.example.baekjoon.stepbystep.LV5_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S9_2908 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        int a = Integer.parseInt(line.split(" ")[0]);
        int b = Integer.parseInt(line.split(" ")[1]);

        int a_reverse = 0;
        int b_reverse = 0;

        int mod = 100;

        for (int i = 0; i < 3; i++) {
            a_reverse += a % 10 * mod;
            b_reverse += b % 10 * mod;
            a /= 10;
            b /= 10;
            mod /= 10;
        }

        if (a_reverse > b_reverse) {
            System.out.println(a_reverse);
        } else {
            System.out.println(b_reverse);
        }
    }
}
