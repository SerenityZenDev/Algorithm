package org.example.baekjoon.stepbystep.LV9_약수_배수와_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3_9506 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int target = Integer.parseInt(br.readLine());

            if (target == -1) {
                break;
            }

            int sum = 0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(target).append(" = ");

            for (int i = 1; i < (target / 2) + 1; i++) {
                if (target % i == 0) {
                    sum += i;
                    stringBuilder.append(i).append(" + ");
                }
            }

            if (sum == target) {
                System.out.println(
                    stringBuilder.substring(0, stringBuilder.toString().length() - 2));
            } else {
                System.out.println(target + " is NOT perfect.");
            }
        }
    }
}
