package org.example.baekjoon.stepbystep.strings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class S7_2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String s = br.readLine();
            int counts = Integer.parseInt(s.split(" ")[0]);
            String word = s.split(" ")[1];

            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < counts; k++) {
                    bw.write(word.charAt(j));
                }
            }

            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
