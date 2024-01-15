package org.example.LV2;

public class String_handling_basics {

    public static boolean solution(String s) {
        int length = s.length();
        if (length == 4 || length == 6) {
            char[] list = s.toCharArray();
            for (int i = 0; i < length; i++) {
                if (list[i] > 64) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("a234"));
        System.out.println(solution("1234"));
    }

}
