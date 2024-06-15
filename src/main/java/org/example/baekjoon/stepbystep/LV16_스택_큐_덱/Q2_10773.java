package org.example.baekjoon.stepbystep.LV16_스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;

public class Q2_10773 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        int total = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            total += stack.get(i);
        }

        System.out.println(total);

    }
}
