package org.example.baekjoon.stepbystep.LV13_정렬;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q10_10814 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        String[][] arr = new String[size][2];

        for (int i = 0; i < size; i++) {
            arr[i][0] = in.next();
            arr[i][1] = in.next();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }


    }
}
