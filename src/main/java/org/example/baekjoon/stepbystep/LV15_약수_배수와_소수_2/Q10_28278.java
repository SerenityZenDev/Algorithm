package org.example.baekjoon.stepbystep.LV15_약수_배수와_소수_2;

import java.io.*;
import java.util.Stack;

public class Q10_28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            int order = Integer.parseInt(s.split(" ")[0]);

            if (order == 1) {
                int input = Integer.parseInt(s.split(" ")[1]);
                stack.push(input);
            } else if (order == 2) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.peek() + "\n");
                    stack.pop();
                }
            } else if (order == 3) {
                int count = stack.size();
                bw.write(count + "\n");
            } else if (order == 4) {
                if (stack.isEmpty()) bw.write("1\n");
                else bw.write("0\n");
            } else {
                if (stack.isEmpty()) bw.write("-1\n");
                else bw.write(stack.peek() + "\n");
            }
        }
        bw.flush();
    }
}
