package org.example.programmers.highScoreKit.hash;

import java.util.HashSet;

public class Q1_폰켓몬 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        System.out.println(solution(nums)); // 2
    }

    public static int solution(int[] nums) {
        int size = nums.length;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(nums[i]);
        }

        if (set.size() > size / 2) {
            return size / 2;
        } else {
            return set.size();
        }
    }
}
