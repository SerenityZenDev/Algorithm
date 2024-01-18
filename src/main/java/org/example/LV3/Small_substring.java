package org.example.LV3;

public class Small_substring {
    // https://school.programmers.co.kr/learn/courses/30/lessons/147355
    public static int solution(String t, String p) {
        int answer = 0;
        char[] chars = t.toCharArray();

        int size = p.length();
        for (int i=0; i<=t.length() - size; i++){
            String tosize = "";
            for (int j=i;j<size+i; j++){
                tosize += chars[j];
            }
            if (Long.parseLong(tosize) <= Long.parseLong(p)) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("10203", "15"));
    }
}
