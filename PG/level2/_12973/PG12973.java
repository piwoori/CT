package PG.level2._12973;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class PG12973 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            }
            else {
                stack.push(c);
            }
        }

        System.out.println(stack.isEmpty() ? 1 : 0);
    }
}
