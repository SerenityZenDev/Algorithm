package org.example.baekjoon.stepbystep.LV14_집합과_맵_단계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q6_1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        int N = Integer.parseInt(line.split(" ")[0]);
        int M = Integer.parseInt(line.split(" ")[1]);

        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            set.add(name);
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (set.contains(name)) {
                count++;
                list.add(name);
            }
        }

        Collections.sort(list);

        System.out.println(count);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
