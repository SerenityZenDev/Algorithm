package org.example.baekjoon.stepbystep.LV13_정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q9_1181 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String[] arr = new String[n];

        in.nextLine();

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        System.out.println(arr[0]);

        for (int i = 1; i < n; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                System.out.println(arr[i]);
            }
        }
    }
}
