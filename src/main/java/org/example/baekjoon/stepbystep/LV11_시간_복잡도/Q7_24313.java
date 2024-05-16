package org.example.baekjoon.stepbystep.LV11_시간_복잡도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7_24313 {

    /*
    input
    7 7
    8
    1

    f(n) = 7n + 7,
    g(n) = n, c = 8,
    n0 = 1이다.
    f(1) = 14, c × g(1) = 8
    이므로 O(n) 정의를 만족하지 못한다.
     */

    /*
    f(n) = 7n + 7,
    g(n) = n,
    c = 8,
    n0 = 10이다.
    모든 n ≥ 10에 대하여 7n + 7 ≤ 8n 이므로 O(n) 정의를 만족한다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        int a = Integer.parseInt(line.split(" ")[0]);
        int b = Integer.parseInt(line.split(" ")[1]);
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        // f(n) = an + b
        // g(n) = n
        // c = c
        // n0 = d

        int fn = a * d + b;
        int cg = c * d;

        if(fn <= cg && c >= a){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}
