package org.example.baekjoon.stepbystep.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S6_10809 {
    /*
    a : 97 - 0
    z : 122 - 25
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        int[] alphabet = new int[26];

        Arrays.fill(alphabet, -1);

        for (int i = 0; i < word.length(); i++) {
            if (alphabet[word.charAt(i) - 'a'] == -1) alphabet[word.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }

    }
}
