package org.example.sparta.LV3;

public class Number_partner {
    public static String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] x = {0,0,0,0,0,0,0,0,0,0};
        int[] y = {0,0,0,0,0,0,0,0,0,0};
        for (int i=0; i< X.length(); i++){
            x[X.charAt(i)-48] += 1;
        }
        for (int i=0; i< Y.length(); i++){
            y[Y.charAt(i)-48] += 1;
        }

        for (int i=9; i>=0; i--){
            answer.append(String.valueOf(i).repeat(Math.max(0, Math.min(x[i], y[i]))));
        }

        if (answer.toString().equals("")) return "-1";
        else if (answer.toString().charAt(0) == 48) return "0";
        return answer.toString();
    }
}
