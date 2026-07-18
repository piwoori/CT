package PG.level2._154539;

import java.util.Arrays;
import java.util.Stack;

public class PG154539 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < numbers.length; i++) {
            while(!stack.isEmpty() &&
                    numbers[stack.peek()] < numbers[i]) {

                answer[stack.pop()] = numbers[i];
            }

            stack.push(i);
        }

        return answer;
    }
}
