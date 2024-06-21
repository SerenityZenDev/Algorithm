package org.example.baekjoon.stepbystep.LV16_스택_큐_덱;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q8_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            queue.add(i + 1);
        }

        sb.append("<");

        while (queue.size() > 1) {

            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }

            sb.append(queue.poll()).append(", ");
        }


        sb.append(queue.poll()).append(">");
        System.out.println(sb);

    }
}
