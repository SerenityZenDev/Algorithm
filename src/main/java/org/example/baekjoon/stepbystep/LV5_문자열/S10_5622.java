package org.example.baekjoon.stepbystep.LV5_문자열;

import java.util.Scanner;

public class S10_5622 {

    public static void main(String[] args) {
       int[] alphabet = {
           2,2,2,
           3,3,3,
           4,4,4,
           5,5,5,
           6,6,6,
           7,7,7,7,
           8,8,8,
           9,9,9,9
       };

       Scanner sc = new Scanner(System.in);
       String word = sc.nextLine();
       int sum = 0;

       for (int i = 0; i < word.length(); i++) {
           sum += alphabet[word.charAt(i) - 'A'];
       }

        System.out.println(sum + word.length());

    }
}
