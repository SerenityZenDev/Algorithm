package org.example.sparta_hard.daily;

import java.util.HashSet;
import java.util.Set;

public class Q5_131701 {

    // 연속 부분 수열 합의 개수
    public static void main(String[] args) {
        int[] arr = {7, 9, 1, 1, 4};
        System.out.println(solution(arr));
    }

    public static int solution(int[] elements) {
        Set<Integer> sumSet = new HashSet<>();
        int n = elements.length;

        // 모든 길이의 연속 부분 수열을 고려
        for (int length = 1; length <= n; length++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;

                // 길이가 length인 부분 수열의 합 계산
                for (int i = 0; i < length; i++) {
                    sum += elements[(start + i) % n];
                }

                sumSet.add(sum);
            }
        }

        // 중복되지 않는 합의 개수를 반환
        return sumSet.size();
    }
}
