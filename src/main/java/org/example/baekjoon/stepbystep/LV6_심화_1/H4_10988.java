package org.example.baekjoon.stepbystep.LV6_심화_1;

import java.util.Scanner;

public class H4_10988 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        StringBuilder reverse = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse.append(word.charAt(i));
        }

        if(word.equals(reverse.toString())){
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
