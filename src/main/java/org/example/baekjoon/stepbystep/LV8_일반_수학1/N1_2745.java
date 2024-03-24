package org.example.baekjoon.stepbystep.LV8_일반_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1_2745 {
    /*
    문자 | 아스키 | 숫자
     A      65     10
     Z      90     35
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        String n = line.split(" ")[0];
        int b = Integer.parseInt(line.split(" ")[1]);
        Long result = 0L;

        for (int i = n.length() - 1; i >= 0; i--) {
            char c = n.charAt(i);
            int pow = (int) Math.pow(b, (n.length() - 1) - i);
            if (c >= 'A' && c <= 'Z') {
                result += (long) (c - 55) * pow;
            } else {
                result += (long) (c - 48) * pow;
            }
        }

        System.out.println(result);
    }
}
