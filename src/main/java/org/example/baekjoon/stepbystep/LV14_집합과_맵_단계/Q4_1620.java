package org.example.baekjoon.stepbystep.LV14_집합과_맵_단계;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Q4_1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int M = Integer.parseInt(input.split(" ")[1]);

        Map<Integer, String> mapI = new HashMap<>();
        Map<String, Integer> mapS = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String temp = br.readLine();
            mapI.put(i, temp);
            mapS.put(temp, i);
        }

        for (int i = 1; i <= M; i++) {
            String temp = br.readLine();
            if (temp.charAt(0) >= '0' && temp.charAt(0) <= '9'){
                bw.write(mapI.get(Integer.parseInt(temp)) + "\n");
            } else {
                bw.write(mapS.get(temp) + "\n");
            }
        }

        bw.flush();
    }
}
