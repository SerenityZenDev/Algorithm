package org.example.baekjoon.stepbystep.LV6_심화_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class H7_1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {


        int repeat = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < repeat; i++) {
            if (check()) {
                count++;
            }
        }

        System.out.println(count);


    }

    public static boolean check() throws IOException {
        String word = br.readLine();
        boolean[] alphabet = new boolean[26];

        char before = '0';
        char now = '0';

        for (int i = 0; i < word.length(); i++) {
            now = word.charAt(i);
            if(before == now) {
                continue;
            } else {
                if (alphabet[now - 'a']) {
                    return false;
                }
                alphabet[now - 'a'] = true;
            }
            before = now;
        }
        return true;
    }
}
