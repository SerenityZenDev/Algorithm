package org.example.baekjoon.stepbystep.LV7_2차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2_2566 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] board = new int[9][9];
        int maxValue = 0;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < 9; i++) {
            String row = br.readLine();
            for (int j = 0; j < 9; j++) {
                board[i][j] = Integer.parseInt(row.split(" ")[j]);
                if (board[i][j] > maxValue) {
                    maxValue = board[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        maxRow++;
        maxCol++;

        System.out.println(maxValue);
        System.out.println(maxRow + " " + maxCol);
    }
}
