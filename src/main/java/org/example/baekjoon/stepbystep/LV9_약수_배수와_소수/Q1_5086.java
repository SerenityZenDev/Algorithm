package org.example.baekjoon.stepbystep.LV9_약수_배수와_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Q1_5086 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String line = br.readLine();

            if (Objects.equals(line, "0 0")) break;
            int first = Integer.parseInt(line.split(" ")[0]);
            int second = Integer.parseInt(line.split(" ")[1]);

            // 1. 첫번째 숫자가 두번째 숫자의 약수이다.
            if (second % first == 0) System.out.println("factor");
            else if (first % second == 0) System.out.println("multiple");
            else System.out.println("neither");
        }
    }
}
