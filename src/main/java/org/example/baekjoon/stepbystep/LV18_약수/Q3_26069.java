package org.example.baekjoon.stepbystep.LV18_약수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q3_26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String userA, userB;

        Set<String> set = new HashSet<>();
        int N = Integer.parseInt(br.readLine());

        set.add("ChongChong");

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            userA = st.nextToken();
            userB = st.nextToken();

            if (set.contains(userA) || set.contains(userB)) {
                set.add(userA);
                set.add(userB);
            }
        }

        System.out.println(set.size());

    }
}
