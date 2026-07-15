package PG.level1._64061;

import java.util.Stack;

public class PG64061 {
    public int solution(int[][] board, int[] moves) {

        Stack<Integer> stack = new Stack<>();

        int answer = 0;

        for(int move : moves) {

            for(int i = 0; i < board.length; i++) {
                if(board[i][move - 1] != 0) {

                    int doll = board[i][move - 1];
                    board[i][move - 1] = 0;

                    if(!stack.isEmpty() && stack.peek() == doll) {
                        stack.pop();
                        answer += 2;
                    }
                    else{
                        stack.push(doll);
                    }

                    break;
                }
            }
        }
        return answer;
    }
}
