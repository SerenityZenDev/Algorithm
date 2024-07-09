package org.example.programmers.highScoreKit.StackQueue;

import java.util.ArrayList;
import java.util.List;

public class Q1_같은숫자는싫어 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
    }

    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            while (i < arr.length - 1) {
                if (arr[i] == arr[i + 1]) {
                    i++;
                } else {
                    break;
                }
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
