package org.example.baekjoon.stepbystep.LV4_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class O7_5597 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        boolean[] arr = new boolean[31];

        for (int n = 0; n < 28; n++) {
            st = new StringTokenizer(br.readLine());
            int value = Integer.parseInt(st.nextToken());
            arr[value] = true;
        }

        for(int i=1; i<arr.length; i++){
            if(!arr[i]) System.out.println(i);
        }
    }
}
