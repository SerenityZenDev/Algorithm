package org.example.sparta.LV3;

public class Babbling {
    public static int solution(String[] babbling) {
        int answer = 0;

        String[] can = {"aya", "ye", "woo", "ma"};

        for (int i=0; i< babbling.length; i++){
            if (babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama")) continue;
            for (int j=0; j< can.length;j++){
                babbling[i] = babbling[i].replace(can[j], " ");
            }
            babbling[i] = babbling[i].replace(" ", "");
            if (babbling[i].length() == 0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] input = {"aya", "yee", "u"};
        System.out.println(solution(input));
    }
}
