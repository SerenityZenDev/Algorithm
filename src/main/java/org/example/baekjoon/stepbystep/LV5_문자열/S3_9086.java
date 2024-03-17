package org.example.baekjoon.stepbystep.LV5_문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class S3_9086 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lineNum = Integer.parseInt(br.readLine());
        for (int i = 0; i < lineNum; i++) {
            String s = br.readLine();
            int size = s.length();
            bw.write(s.charAt(0));
            bw.write(s.charAt(size-1) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
