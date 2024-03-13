package org.example.sparta.daily;

import java.util.Stack;

public class D7_Drap_doll {
    public int solution(int[][] board, int[] moves) {
        int result = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int move : moves) {
            for (int j=0; j<board.length; j++) {
                if (board[j][move -1] != 0){
                    if (stack.peek() == board[j][move -1]) {
                        stack.pop();
                        result += 2;
                    } else {
                        stack.push(board[j][move -1]);
                    }
                    board[j][move -1] = 0;
                    break;
                }
            }
        }
        return result;
    }


}
