package BJ.silver._4._9012;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ9012 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String s = br.readLine();

            Stack<Character> stack = new Stack<>();

            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == '('){
                    stack.push(s.charAt(j));
                }
                else{
                    if(stack.isEmpty()){
                        stack.push(s.charAt(j));
                        break;
                    }
                    else{
                        stack.pop();
                    }
                }
            }

            if(stack.isEmpty()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

        br.close();

    }
}
