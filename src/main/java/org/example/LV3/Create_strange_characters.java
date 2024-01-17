package org.example.LV3;

public class Create_strange_characters {
    public static String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array){
            cnt = ss.contains(" ") ? 0 : cnt+1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }

}
