package org.example.sparta.daily;

public class D5_Split_string {


        public static int solution(String s) {
            int answer = 0;
            char[] chars = s.toCharArray();
            char target = chars[0];
            int correct = 0;
            int notCorrect = 0;


            for (int i=0; i< chars.length; i++){
                if (target == chars[i]) correct++;
                else notCorrect++;

                if (correct == notCorrect){
                    answer++;
                    chars[i] = '0';
                    if (i < chars.length-1) target = chars[i+1];
                }
            }

            if (chars[chars.length-1] == '0'){
                return answer;
            }else{
                return answer+1;
            }

        }

}
