package BJ.silver._4._10828;

import java.io.*;
import java.util.*;

public class BJ10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if(input.startsWith("push")){
                int value = Integer.parseInt(input.split(" ")[1]);
                stack.push(value);
            }
            else if(input.equals("pop")){
                if(stack.isEmpty()){
                    sb.append("-1\n");
                }
                else{
                    sb.append(stack.pop() + "\n");
                }
            }
            else if(input.equals("size")){
                sb.append(stack.size() + "\n");
            }
            else if(input.equals("empty")){
                sb.append((stack.isEmpty() ? "1" : "0") + "\n");
            }
            else if(input.equals("top")){
                if(stack.isEmpty()){
                    sb.append("-1\n");
                }
                else{
                    sb.append(stack.peek() + "\n");
                }
            }
        }

        System.out.println(sb);
    }
}
