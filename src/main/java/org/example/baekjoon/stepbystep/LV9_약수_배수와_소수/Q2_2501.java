package org.example.baekjoon.stepbystep.LV9_약수_배수와_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2_2501 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int n = Integer.parseInt(input.split(" ")[0]);
        int m = Integer.parseInt(input.split(" ")[1]);

        for (int i = 1; i <= n; i++) {
            if(n % i == 0) m--;
            if (m == 0) {
                System.out.println(i);
                break;
            }
        }
        if (m != 0) {
            System.out.println(0);
        }


    }
}
