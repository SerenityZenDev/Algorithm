package org.example.baekjoon.stepbystep.LV10_기하_직사각형과_삼격형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2_1085 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        int x = Integer.parseInt(line.split(" ")[0]);
        int y = Integer.parseInt(line.split(" ")[1]);
        int w = Integer.parseInt(line.split(" ")[2]);
        int h = Integer.parseInt(line.split(" ")[3]);

        System.out.println(Math.min(Math.min(w-x, x),Math.min(h-y, y)));

        br.close();
    }
}
