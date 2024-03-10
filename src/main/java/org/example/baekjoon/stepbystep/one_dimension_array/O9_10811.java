package org.example.baekjoon.stepbystep.one_dimension_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class O9_10811 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int basketSize = Integer.parseInt(st.nextToken());
        int changeCount = Integer.parseInt(st.nextToken());

        int[] basket = new int[basketSize];
        for (int i = 0; i < basketSize; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < changeCount; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int[] temp = new int[end - start + 1];
            for (int j = 0; j < end - start + 1; j++) {
                temp[j] = basket[start + j - 1];
            }
            for (int j = start -1; j < end; j++) {
                basket[j] = temp[end - j - 1];
            }
        }

        for (int i = 0; i < basketSize; i++) {
            System.out.print(basket[i] + " ");
        }

    }

}
