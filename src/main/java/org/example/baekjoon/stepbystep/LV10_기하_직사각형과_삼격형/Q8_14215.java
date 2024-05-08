package org.example.baekjoon.stepbystep.LV10_기하_직사각형과_삼격형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q8_14215 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        int a = Integer.parseInt(line.split(" ")[0]);
        int b = Integer.parseInt(line.split(" ")[1]);
        int c = Integer.parseInt(line.split(" ")[2]);

        int[] list = {a, b, c};
        Arrays.sort(list);

        if (list[0] + list[1] > list[2]) {
            System.out.println(list[0] + list[1] + list[2]);
        } else {
            System.out.println((list[0] + list[1]) * 2 - 1);
        }
    }

}
