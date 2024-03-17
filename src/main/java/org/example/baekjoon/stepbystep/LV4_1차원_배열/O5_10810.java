package org.example.baekjoon.stepbystep.LV4_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class O5_10810 {
    public static void main(String[] args) throws IOException {
        /*
        1. 1 ~ N번 바구니 존재
        2. 1 ~ N번 공 존재
        3. 시작 시 바구니에 공 존재하지 않음
        4. 바구니에는 공 1개만 있을 수 있음
        5. 공이 있는 바구니에 새로운 공을 넣으려면 앞에 공은 제거
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int basketSize = Integer.parseInt(st.nextToken());
        int ballCount = Integer.parseInt(st.nextToken());

        int[] arr = new int[basketSize];

        for (int i = 0; i < ballCount; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            for(int j = start; j < end; j++){
                arr[j] = value;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
