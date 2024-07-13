package org.example.programmers.highScoreKit.heap;

import java.util.PriorityQueue;

public class Q1_더맵게 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            que.add(scoville[i]);
        }

        while (que.peek() < K) {
            if (que.size() == 1) return -1;
            que.add(que.poll() + que.poll() * 2);
            answer++;
        }
        return answer;
    }
}
