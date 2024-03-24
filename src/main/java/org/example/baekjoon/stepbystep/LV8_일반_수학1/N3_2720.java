package org.example.baekjoon.stepbystep.LV8_일반_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N3_2720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repeat = Integer.parseInt(br.readLine());

        for (int i = 0; i < repeat; i++) {
            int money = Integer.parseInt(br.readLine());
            getChange(money);
        }
    }

    private static void getChange(int money) {
        int quater = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;

        while (money >= 25) {
            money -= 25;
            quater++;
        }

        while (money >= 10) {
            money -= 10;
            dime++;
        }

        while (money >= 5) {
            money -= 5;
            nickel++;
        }

        while (money >= 1) {
            money -= 1;
            penny++;
        }

        System.out.println(quater + " " + dime + " " + nickel + " " + penny);
    }
}
