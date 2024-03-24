package org.example.baekjoon.stepbystep.LV8_일반_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class N2_11005 {

    /*
        문자 | 아스키 | 숫자
         A      65     10
         Z      90     35
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        Long n = Long.parseLong(line.split(" ")[0]);
        int b = Integer.parseInt(line.split(" ")[1]);

        List<Character> arr = new ArrayList<>();

        while(n > 0){
            long divideResult = n % b;
            char input = (char)(divideResult);
            if(input >= 10) arr.add((char) (input + 55));
            else arr.add((char) (input + 48));
            n /= b;
        }
        for(int i=arr.size()-1; i>=0; i--){
            System.out.print(arr.get(i));
        }
    }
}
