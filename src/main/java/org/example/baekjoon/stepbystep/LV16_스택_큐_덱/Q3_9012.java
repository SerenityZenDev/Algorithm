package org.example.baekjoon.stepbystep.LV16_스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;

public class Q3_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            System.out.println(solve(br.readLine()));
        }
    }

    private static String solve(String br) {
        String temp = br;
        int count = 0;

        for (int j = 0; j < temp.length(); j++) {
            if (temp.charAt(j) == '(') {
                count++;
            } else {
                count--;
            }

            if (count < 0) {
                return "NO";
            }
        }

        if (count == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
