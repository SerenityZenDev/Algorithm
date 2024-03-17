package org.example.baekjoon.stepbystep.LV6_심화_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class H2_3003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] chess = {1,1,2,2,2,8};
        int[] inputchess = new int[chess.length];

        String input = br.readLine();
        for (int i = 0; i < input.split(" ").length; i++) {
            inputchess[i] = Integer.parseInt(input.split(" ")[i]);
        }

        for (int i=0; i< chess.length; i++){
            bw.write(chess[i] - inputchess[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
