package org.example.baekjoon.stepbystep.LV8_일반_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N7_2869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        int A = Integer.parseInt(line.split(" ")[0]);
        int B = Integer.parseInt(line.split(" ")[1]);
        int V = Integer.parseInt(line.split(" ")[2]);
        int now = 0;
        int day = 0;

        while(true){
            day++;
            now += A;
            if(now >= V) break;
            now -= B;
        }

        System.out.println(day);

    }

}
