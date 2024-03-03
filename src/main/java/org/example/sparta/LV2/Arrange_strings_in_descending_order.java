package org.example.sparta.LV2;


public class Arrange_strings_in_descending_order {
    public static String solution(String s) {
        String answer = "";
        char[] list = s.toCharArray();

        for(int i=0; i<list.length; i++){
            for (int j=0; j< list.length-i-1; j++){
                if (list[j] < list[j+1]){
                    char temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }

        for (int i=0; i< list.length; i++){
            answer += list[i];
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }

}
