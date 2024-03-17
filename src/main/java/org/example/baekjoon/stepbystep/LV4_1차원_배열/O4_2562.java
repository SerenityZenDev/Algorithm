package org.example.baekjoon.stepbystep.LV4_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class O4_2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int index = 0;

        for (int i=0; i<9; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value > max) {
                max = value;
                index = i;
            }

        }
        System.out.println(max);
        System.out.println(index + 1);
    }

}
