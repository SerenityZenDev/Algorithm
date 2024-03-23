package org.example.baekjoon.stepbystep.LV7_2차원_배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class S3_10798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Character[][] map = new Character[15][15];
        int row = 0;
        int col = 0;

        while (true) {
            String rowLine = br.readLine();
            if (rowLine == null || rowLine.isEmpty()) {
                break;
            }
            for (int i = 0; i < rowLine.length(); i++) {
                map[row][i] = rowLine.charAt(i);
                col = Math.max(i, col);
            }
            row++;
        }
        col++;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (map[j][i] == null) {
                    continue;
                }
                bw.write(map[j][i]);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
