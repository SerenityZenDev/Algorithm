package org.example.baekjoon.stepbystep.LV10_기하_직사각형과_삼격형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q3_3009 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String line = br.readLine();
            int x = Integer.parseInt(line.split(" ")[0]);
            int y = Integer.parseInt(line.split(" ")[1]);

            if (row.contains(x)) {
                row.remove((Integer) x);
            } else {
                row.add(x);
            }
            if (col.contains(y)) {
                col.remove((Integer) y);
            } else {
                col.add(y);
            }
        }
        System.out.println(row.get(row.size() - 1) + " " + col.get(col.size() - 1));
    }
}
