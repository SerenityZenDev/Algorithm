package org.example.baekjoon.stepbystep.LV16_스택_큐_덱;

import java.io.*;
import java.util.StringTokenizer;

public class Q6_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] queue = new int[N];
        int sIndex = 0;
        int nIndex = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();
            if (command.contains("push")) {
                queue[nIndex++] = Integer.parseInt(st.nextToken());
            } else if (command.equals("pop")) {
                if (nIndex - sIndex == 0) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue[sIndex++] + "\n");
                }
            } else if (command.equals("size")) {
                bw.write(nIndex - sIndex + "\n");
            } else if (command.equals("empty")) {
                if (nIndex - sIndex == 0) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (command.equals("front")) {
                if (sIndex == nIndex) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue[sIndex] + "\n");
                }
            } else { // back
                if (sIndex == nIndex) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue[nIndex - 1] + "\n");
                }
            }
        }

        bw.flush();
    }
}
