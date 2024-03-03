package org.example.sparta.LV3;

import java.util.Arrays;

public class Sort_strings_however_you_want {
    public static String[] solution(String[] strings, int n) {

        Arrays.sort(strings);
        for(int i=0; i< strings.length; i++){
            for (int j=0; j< strings.length-1; j++){
                if (strings[j].charAt(n) > strings[j+1].charAt(n)){
                    String temp = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = temp;
                }
            }
        }



        return strings;
    }

    public static void main(String[] args) {
        String[] strings = {"sun" , "bed", "car"};
        solution(strings, 1);
    }
}
