package org.example.baekjoon.stepbystep.LV14_집합과_맵_단계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q7_1269 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        int A = Integer.parseInt(line.split(" ")[0]);
        int B = Integer.parseInt(line.split(" ")[1]);

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        StringTokenizer stA = new StringTokenizer(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());

        while (stA.hasMoreTokens()) {
            int temp = Integer.parseInt(stA.nextToken());
            setA.add(temp);
            result.add(temp);
        }

        while (stB.hasMoreTokens()) {
            int temp = Integer.parseInt(stB.nextToken());
            setB.add(temp);
            result.add(temp);
        }

        System.out.println((result.size() - setA.size()) + (result.size() - setB.size()));
    }
}
