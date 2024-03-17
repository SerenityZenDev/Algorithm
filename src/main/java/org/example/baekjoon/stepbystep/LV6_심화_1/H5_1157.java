package org.example.baekjoon.stepbystep.LV6_심화_1;

import java.util.Scanner;

public class H5_1157 {
/*
A : 65
Z : 90
a : 97
z : 122
 */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int[] alphabet = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(ch >= 65 && ch <= 90){
                alphabet[ch - 'A']++;
            }else if (ch >= 97 && ch <= 122){
                alphabet[ch - 'a']++;
            }
        }

        int max = 0;
        int maxValue = 0;
        boolean eq = false;
        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] > maxValue){
                maxValue =  alphabet[i];
                max = i;
                eq = false;
            }else if(alphabet[i] == maxValue){
                eq = true;
            }
        }
        if(eq){
            System.out.println("?");
        }else {
            System.out.println((char)(max + 65));
        }

    }
}
