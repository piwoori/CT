package BJ.silver._4._10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
          Integer num = Integer.parseInt(br.readLine());
          if(num == 0){
              stack.pop();
          }
          else{
              stack.push(num);
          }
        }

        int sum = 0;

        for(int i = 0; i < stack.size(); i++){
            sum += stack.get(i);
        }

        System.out.println(sum);
    }
}
