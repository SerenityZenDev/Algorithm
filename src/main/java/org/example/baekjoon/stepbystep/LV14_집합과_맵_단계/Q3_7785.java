package org.example.baekjoon.stepbystep.LV14_집합과_맵_단계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q3_7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            String name = temp.split(" ")[0];
            String log = temp.split(" ")[1];

            if (log.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        for (String s : list) {
            System.out.println(s);
        }
    }
}
