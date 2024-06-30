package org.example.baekjoon.stepbystep.LV18_약수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1_1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        if (N < 2) {
            int temp = Integer.parseInt(br.readLine());
            System.out.println(temp * temp);
        } else {
            st = new StringTokenizer(br.readLine());
            int min = 1000000;
            int max = 0;
            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
            System.out.println(max * min);
        }
    }
}
