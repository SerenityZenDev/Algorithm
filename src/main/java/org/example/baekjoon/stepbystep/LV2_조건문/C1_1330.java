package org.example.baekjoon.stepbystep.LV2_조건문;

import java.util.Scanner;

public class C1_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int a = Integer.parseInt(line.split(" ")[0]);
        int b = Integer.parseInt(line.split(" ")[1]);

        if (a > b) System.out.println(">");
        else if (a < b) System.out.println("<");
        else System.out.println("==");

    }
}
