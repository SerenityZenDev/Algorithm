package org.example.baekjoon.stepbystep.LV15_약수_배수와_소수_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8_17103 {

    static boolean[] flag;

    public static void main(String[] args) throws IOException {
        flag = new boolean[1000001];
        makeflag(flag);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int temp = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int j = 2; j <= temp / 2; j++) {
                if (!flag[j] && !flag[temp - j]) ans++;
            }
            System.out.println(ans);
        }
    }

    private static void makeflag(boolean[] flag) {
        flag[0] = flag[1] = true;
        for (int i = 2; i < Math.sqrt(flag.length); i++) {
            if (flag[i]) {
                continue;
            }
            for (int j = i * i; j < flag.length; j += i) {
                flag[j] = true;
            }
        }
    }
}
