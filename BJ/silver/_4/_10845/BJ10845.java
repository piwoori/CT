package BJ.silver._4._10845;

import java.io.*;
import java.util.*;

public class BJ10845 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();
        int lastInput = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            if (s.startsWith("push")) {
                lastInput = Integer.parseInt(s.split(" ")[1]);
                que.add(lastInput);

            } else if (s.equals("pop")) {
                sb.append(que.isEmpty() ? -1 : que.poll()).append('\n');

            } else if (s.equals("size")) {
                sb.append(que.size()).append('\n');

            } else if (s.equals("empty")) {
                sb.append(que.isEmpty() ? 1 : 0).append('\n');

            } else if (s.equals("front")) {
                sb.append(que.isEmpty() ? -1 : que.peek()).append('\n');

            } else if (s.equals("back")) {
                sb.append(que.isEmpty() ? -1 : lastInput).append('\n');
            }
        }

        System.out.print(sb.toString());
        br.close();
    }
}