package BJ.silver._4._10866;

import java.io.*;
import java.util.*;

public class BJ10866 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deq = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            if(s.startsWith("push_front")){
                deq.offerFirst(Integer.parseInt(s.split(" ")[1]));
            }
            else if(s.startsWith("push_back")){
                deq.offerLast(Integer.parseInt(s.split(" ")[1]));
            }
            else if(s.equals("pop_front")){
                sb.append(deq.isEmpty()? "-1" : deq.pollFirst()).append('\n');
            }
            else if(s.equals("pop_back")){
                sb.append(deq.isEmpty()? "-1" : deq.pollLast()).append('\n');
            }
            else if(s.equals("size")){
                sb.append(deq.size()).append('\n');
            }
            else if(s.equals("empty")){
                sb.append(deq.isEmpty() ? "1" : "0").append('\n');
            }
            else if(s.equals("front")){
                sb.append(deq.isEmpty() ? "-1" : deq.peekFirst()).append('\n');
            }
            else if(s.equals("back")){
                sb.append(deq.isEmpty() ? "-1" : deq.peekLast()).append('\n');
            }
        }
        System.out.print(sb.toString());
        br.close();
    }
}