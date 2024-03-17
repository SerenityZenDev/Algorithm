package org.example.baekjoon.stepbystep.LV4_1차원_배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class O2_10871 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer first = new StringTokenizer(br.readLine()," ");
        int size = Integer.parseInt(first.nextToken());
        int max = Integer.parseInt(first.nextToken());

        StringTokenizer second = new StringTokenizer(br.readLine()," ");
        while (second.hasMoreTokens()) {
            int value = Integer.parseInt(second.nextToken());
            if (value < max) bw.write(value+" ");
        }
        br.close();
        bw.flush();
        bw.close();


    }

}
