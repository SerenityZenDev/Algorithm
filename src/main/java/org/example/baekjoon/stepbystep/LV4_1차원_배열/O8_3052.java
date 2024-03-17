package org.example.baekjoon.stepbystep.LV4_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class O8_3052 {
    public static final int DIVIDE_VALUE = 42;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            set.add(Integer.parseInt(st.nextToken())%DIVIDE_VALUE);
        }
        System.out.println(set.size());
    }

}
