package org.example.baekjoon.stepbystep.LV12_브루스_포트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3_19532 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        // ax + by = c
        // dx + ey = f
        /*
        1, 3, -1, 4, 1, 7

        x + 3y = -1
        4x + y = 7

        (-1 * 1 - 3 * 7) / (1 * 1 - 3 * 4) = (-1 - 21) / (1 - 12) = -22/-11 = 2

         */

        int x = (c * e - b * f) / (a * e - b * d);
        int y = (c * d - a * f) / (b * d - a * e);

        System.out.println(x + " " + y);
    }
}
