package org.example.baekjoon.stepbystep.LV15_약수_배수와_소수_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4_2485 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[] tree = new int[size];

        for (int i = 0; i < size; i++) {
            tree[i] = Integer.parseInt(br.readLine());
        }

        br.close();
        int gcd = 0;

        for (int i = 1; i < size - 1; i++) {
            int distance = tree[i + 1] - tree[i];
            gcd = findGCD(distance, gcd);
        }

        System.out.println((tree[size - 1] - tree[0])/gcd + 1 - (tree.length ));
    }

    private static int findGCD(int A, int B) {
        while (B != 0) {
            int R = A % B;
            A = B;
            B = R;
        }
        return A;
    }
}
