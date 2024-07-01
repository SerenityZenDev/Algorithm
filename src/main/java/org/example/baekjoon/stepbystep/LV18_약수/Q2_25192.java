package org.example.baekjoon.stepbystep.LV18_약수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Q2_25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        Set<String> set = new HashSet<>();

        while (n-- > 0) {
            String str = br.readLine();
            if (str.equals("ENTER")) {
                result += set.size();
                set.clear();
                continue;
            }
            set.add(str);
        }

        result += set.size();

        System.out.println(result);
    }
}
