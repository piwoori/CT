package PG.level2._131704;

import java.util.Stack;

public class PG131704{
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();

        int current = 1;
        int idx = 0;

        while(current <= order.length){

            if(current == order[idx]){
                idx++;
            }
            else{
                stack.push(current);
            }

            current++;

            while(!stack.isEmpty() && idx < order.length && stack.peek() == order[idx]){
                stack.pop();
                idx++;
            }
        }

        return idx;
    }
}