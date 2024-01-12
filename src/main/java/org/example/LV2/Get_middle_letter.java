package org.example.LV2;

public class Get_middle_letter {
    public static String solution(String s) {
        char[] ss = s.toCharArray();
        String answer = "";
        int length = s.length();

        if(length % 2 == 0){
            length = length/2 - 1;
            answer += ss[length];
            answer += ss[length+1];
        }else{
            length = length/2;
            answer += ss[length];

        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }

}
