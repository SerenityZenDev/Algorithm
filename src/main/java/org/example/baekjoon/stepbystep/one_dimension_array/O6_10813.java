package org.example.baekjoon.stepbystep.one_dimension_array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class O6_10813 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int changeCount = Integer.parseInt(st.nextToken());

        int[] arr = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < changeCount; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            swap(arr, a, b);
        }

        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
