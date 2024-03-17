package org.example.baekjoon.stepbystep.LV1_입출력과_사칙연산;

import java.util.Scanner;

public class I11_11382 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        Long total = 0L;

        for (int i=0; i<a.split(" ").length; i++) {
            total += Long.parseLong(a.split(" ")[i]);
        }
        System.out.println(total);
    }
}
