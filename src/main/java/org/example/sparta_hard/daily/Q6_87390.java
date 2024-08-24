package org.example.sparta_hard.daily;

import java.util.ArrayList;
import java.util.List;

public class Q6_87390 {

    /*
    n ^ 2 배열 자르기
    00 01 02
    10 11 12
    20 21 22

    1 2 3
    2 2 3
    3 3 3

     1 2  3  4  5  6  7  8  9
    00 01 02 10 11 12 20 21 22

     */
    public static void main(String[] args) {
        System.out.println(solution(3, 2, 5));
    }


    public static List<Long> solution(int n, long left, long right) {

        List<Long> list = new ArrayList<>();

        for (long i = left; i < right + 1; i++) {
            list.add(Math.max(i / n, i % n) + 1);
        }

        return list;
    }
}
