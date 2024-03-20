package org.example.sparta.daily;

import java.util.Stack;

public class D12_Rotate_parentheses {

    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            String temp = spin(s, i);
            if (correct(temp)) answer++;
        }

        return answer;
    }

    private boolean correct(String temp) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);
            if (stack.empty()) {
                stack.push(temp.charAt(i));
            } else if(c == ')' && stack.peek() == '(') {
                stack.pop();
            } else if(c == '}' && stack.peek() == '{') {
                stack.pop();
            } else if(c == ']' && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    private String spin(String s, int i) {
        return s.substring(i, s.length()) + s.substring(0, i);
    }

    public static void main(String[] args) {
        D12_Rotate_parentheses d = new D12_Rotate_parentheses();
        System.out.println(d.solution("[](){}"));
    }
}
