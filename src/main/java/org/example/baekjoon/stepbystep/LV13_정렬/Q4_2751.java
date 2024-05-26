package org.example.baekjoon.stepbystep.LV13_정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q4_2751 {
    /*
    해당문제는 시간제한이 중요!
    Arrays.sort()를 사용 시 시간초과 - dual-pivot Quicksort를 사용 | 평균 시간복잡도 O(nlogn) | 최악 시간복잡도 O(n^2)
    최악에 걸리도록 저격한 데이터가 존재
    따라서 최악에도 O(nlogn)을 보장하는 알고리즘을 사용해야 함

    Collections.sort()를 사용 - Timsort 사용 - 합병 및 삽입정렬 사용 - hybrid sorting algorithm
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for(int i = 0 ; i < size ; i++){
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }
}
