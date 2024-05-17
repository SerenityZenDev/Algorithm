package org.example.baekjoon.stepbystep.LV12_브루스_포트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1_2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        int N = Integer.parseInt(line.split(" ")[0]);
        int M = Integer.parseInt(line.split(" ")[1]);

        String user = br.readLine();
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(user.split(" ")[i]);
        }
        int result = search(cards, N, M);
        System.out.println(result);
    }

    static int search(int[] arr, int N, int M){
        int result = 0;
        for (int i = 0; i < N-2; i++) {
            for (int j = i + 1; j < N-1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int temp = arr[i] + arr[j] + arr[k];

                    if (temp == M) {
                        return temp;
                    }

                    if (result < temp && temp < M) {
                        result = temp;
                    }
                }
            }
        }

        return result;
    }
}
