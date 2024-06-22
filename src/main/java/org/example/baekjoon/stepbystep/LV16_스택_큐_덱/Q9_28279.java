package org.example.baekjoon.stepbystep.LV16_스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q9_28279 {
    /*
    1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
    2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
    3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
    4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
    5: 덱에 들어있는 정수의 개수를 출력한다.
    6: 덱이 비어있으면 1, 아니면 0을 출력한다.
    7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
    8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deq = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1:
                    deq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    deq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if (deq.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deq.pollFirst()).append("\n");
                    }
                    break;
                case 4:
                    if (deq.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deq.pollLast()).append("\n");
                    }
                    break;
                case 5:
                    sb.append(deq.size()).append("\n");
                    break;
                case 6:
                    if (deq.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case 7:
                    if (deq.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deq.peekFirst()).append("\n");
                    }
                    break;
                case 8:
                    if (deq.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deq.peekLast()).append("\n");
                    }
            }

        }
        System.out.println(sb);
    }
}
