package org.example.baekjoon.stepbystep.LV14_집합과_맵_단계;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q5_10816 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer stN = new StringTokenizer(br.readLine(), " ");

        Map<Integer, Integer> map = new HashMap<>();
        while (stN.hasMoreTokens()) {
            int key = Integer.parseInt(stN.nextToken());
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer stM = new StringTokenizer(br.readLine(), " ");

        while (stM.hasMoreTokens()) {
            int temp = Integer.parseInt(stM.nextToken());
            bw.write(map.getOrDefault(temp, 0) + " ");
        }

        bw.flush();
    }
}
