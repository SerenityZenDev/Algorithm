package org.example.LV3;

public class Create_strange_characters {
    /*
    public String solution(String s) {
        String answer = "";
        char[] string = s.trim().toCharArray();
        for (int i=0; i<string.length; i++){
            if(i%2 == 0 && string[i] > 96 && string[i] < 123){
                answer += (char)(string[i] - 32);
            }else if(i%2 == 1 && string[i] < 96 && string[i] > 64){
                answer += (char)(string[i] + 32);
            }else{
                answer += string[i];
            }
        }
        return answer;
    }
     */
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
