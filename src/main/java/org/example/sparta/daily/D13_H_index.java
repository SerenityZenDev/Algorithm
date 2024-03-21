package org.example.sparta.daily;

import java.util.Arrays;

public class D13_H_index {
    public int solution(int[] citations) {
        int hIndex = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;

            if (citations[i] >= h){
                hIndex = h;
                break;
            }
        }
        return hIndex;
    }

    public static void main(String[] args) {

        D13_H_index d = new D13_H_index();
        System.out.println(d.solution(new int[]{3, 0, 6, 1, 5}));
    }
}
