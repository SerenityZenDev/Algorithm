package org.example.LV3;

public class Numeric_strings_and_English {
    public int solution(String s) {
        int answer = 0;
        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<10;i++){
            s=s.replace(num[i],Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}
