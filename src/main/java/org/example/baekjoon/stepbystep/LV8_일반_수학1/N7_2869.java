package org.example.baekjoon.stepbystep.LV8_일반_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N7_2869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        int up = Integer.parseInt(line.split(" ")[0]);
        int down = Integer.parseInt(line.split(" ")[1]);
        int length = Integer.parseInt(line.split(" ")[2]);

        int day = (length - down) / (up - down);

        if ((length - down) % (up - down) != 0) day++;

        System.out.println(day);

    }

}
