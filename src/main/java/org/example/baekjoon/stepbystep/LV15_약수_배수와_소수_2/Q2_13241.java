package org.example.baekjoon.stepbystep.LV15_약수_배수와_소수_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2_13241 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        br.close();

        if (A > B){
            bw.write((A * B)/gcd(A,B) + "\n");
        } else if (A < B){
            bw.write((B * A)/gcd(B,A) + "\n");
        } else {
            bw.write(A + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;

            a = b;
            b = r;
        }
        return a;
    }
}
