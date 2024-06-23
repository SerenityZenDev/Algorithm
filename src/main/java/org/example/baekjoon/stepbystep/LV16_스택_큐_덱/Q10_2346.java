package org.example.baekjoon.stepbystep.LV16_스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q10_2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<int[]> deq = new ArrayDeque<>();
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        sb.append("1 ");
        int in = arr[0];

        for (int i = 1; i < N; i++) {
            deq.addLast(new int[]{(i + 1), arr[i]});
        }

        while (!deq.isEmpty()) {
            if (in > 0) {
                for (int i = 1; i < in; i++) {
                    deq.add(deq.poll());
                }

                int[] next = deq.poll();
                in = next[1];
                sb.append(next[0] + " ");
            } else {
                for (int i = 1; i < -in; i++) {
                    deq.addFirst(deq.pollLast());
                }

                int[] next = deq.pollLast();
                in = next[1];
                sb.append(next[0] + " ");
            }
        }

        System.out.println(sb);
    }
}
