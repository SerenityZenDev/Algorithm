package org.example.baekjoon.stepbystep.LV7_2차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1_2738 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String size = br.readLine();
        int row = Integer.parseInt(size.split(" ")[0]);
        int col = Integer.parseInt(size.split(" ")[1]);

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            String line = br.readLine();
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(line.split(" ")[j]);
            }
        }

        for (int i = 0; i < row; i++) {
            String line = br.readLine();
            for (int j = 0; j < col; j++) {
                arr[i][j] += Integer.parseInt(line.split(" ")[j]);
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
