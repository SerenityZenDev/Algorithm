package org.example.programmers.highScoreKit.StackQueue;

public class Q2_올바른괄호 {
    public static void main(String[] args) {

    }

    boolean solution(String s) {
        boolean answer = true;

        int base = 0;

        char[] c = s.toCharArray();

        for (char c1 : c) {
            if (base < 0) {
                return false;
            } else if (c1 == '(') {
                base++;
            } else {
                base--;
            }
        }

        if (base != 0) {
            answer = false;
        }

        return answer;
    }
}
