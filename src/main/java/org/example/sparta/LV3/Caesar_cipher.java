package org.example.sparta.LV3;

public class Caesar_cipher {
    /*
    아스키 코드 필요한 부분 정리
    영문 소문자 97(a) ~ 122(z)
    영문 대문자 65(A) ~ 90(Z)
    공백 32
     */
    public String solution(String s, int n) {
        String answer = "";
        char[] chars = s.toCharArray();

        for (int i=0; i< chars.length; i++){
            if (chars[i] == 32){
                continue;
            }else if(chars[i] > 64 && chars[i] < 91){
                if(chars[i] + n > 90){
                    chars[i] = (char) (chars[i] + n - 26);
                }else{
                    chars[i] = (char) (chars[i] + n);
                }
            }else{
                if (chars[i] + n > 122){
                    chars[i] = (char) (chars[i] + n -26);
                }else{
                    chars[i] = (char) (chars[i] + n);
                }
            }
        }
        for (int i=0; i< chars.length; i++){
            answer += chars[i];
        }
        return answer;
    }
}
