package org.example.LV4;

public class Repeat_binary_conversion {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while(s.length() > 1){
           int zeroCnt = 0;

           for (int i=0; i<s.length(); i++){
               if (s.charAt(i) == '0') answer[1]++;
               else zeroCnt++;
           }

           s = Integer.toBinaryString(zeroCnt);
           answer[0]++;

        }

        return answer;
    }
}
