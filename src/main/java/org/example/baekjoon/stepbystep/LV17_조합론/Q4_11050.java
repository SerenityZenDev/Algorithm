package org.example.baekjoon.stepbystep.LV17_조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4_11050 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // nCk = n! / ((n-k)! * k!)
        System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
    }

    private static int factorial(int n) {
        // factorial(0) == 1 이다.
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
