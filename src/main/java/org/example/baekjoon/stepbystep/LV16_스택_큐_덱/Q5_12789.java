package org.example.baekjoon.stepbystep.LV16_스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q5_12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] lineStack = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            lineStack[i] = Integer.parseInt(st.nextToken());
        }

        int order = 1;

        for (int i = 0; i < N; i++) {
            if (lineStack[i] == order) {
                order++;
            } else if (!stack.isEmpty() && stack.peek() == order) {
                order++;
                i--;
                stack.pop();
            } else {
                stack.push(lineStack[i]);
            }
        }

        if (!stack.isEmpty()) {
            for (int i = order; i <= N; i++) {
                if (stack.peek() == i) {
                    stack.pop();
                } else {
                    break;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }


    }
}
