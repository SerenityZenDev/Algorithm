package org.example.baekjoon.stepbystep.LV14_집합과_맵_단계;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.print.attribute.standard.MediaSize.NA;

public class Q1_10815 {

    static int N, M;
    static int[] NArray;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        StringTokenizer stN = new StringTokenizer(br.readLine(), " ");
        NArray = new int[N];
        for (int i = 0; i < N; i++) {
            NArray[i] = Integer.parseInt(stN.nextToken());
        }
        Arrays.sort(NArray);

        M = Integer.parseInt(br.readLine());
        StringTokenizer stM = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            int temp = Integer.parseInt(stM.nextToken());
            bw.write(search(temp) + " ");
        }

        bw.flush();

    }

    public static int search(int num) {
        int left = 0;
        int right = N - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int middleValue = NArray[mid];
            if (num > middleValue) {
                left = mid + 1;
            } else if (num < middleValue) {
                right = mid - 1;
            } else {
                return 1;
            }
        }

        return 0;
    }
}
