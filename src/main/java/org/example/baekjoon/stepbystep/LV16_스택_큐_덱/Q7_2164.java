package org.example.baekjoon.stepbystep.LV16_스택_큐_덱;

import java.util.*;

public class Q7_2164 {
    /*
    N = 4

    1) 1234 -> 234
    2) 234 -> 342
    3) 342 -> 42
    4) 42 -> 24
    5) 24 -> 4

    N = 5

    1) 12345 -> 2345
    2) 2345 -> 3452
    3) 3452 -> 452
    4) 452 -> 524
    5) 524 -> 24
    6) 24 ->
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        while (q.size() > 1) {
            q.poll();
            q.offer(q.poll());
        }

        System.out.println(q.poll());
    }
}
