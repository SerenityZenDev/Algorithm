package org.example.sparta.LV3;

public class Closest_same_letter {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] st = s.toCharArray();
        for (int i=0; i<s.length()-1; i++){
            for (int j=i+1; j<s.length(); j++){
                if (st[i] == st[j]){
                    answer[j] = j-i;
                }
            }
        }

        for (int i=0; i<s.length(); i++){
            if (answer[i] == 0){
                answer[i] = -1;
            }
        }

        return answer;
    }
}
