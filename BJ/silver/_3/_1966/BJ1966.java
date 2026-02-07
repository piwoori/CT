package BJ.silver._3._1966;

import java.io.*;
import java.util.*;

public class BJ1966 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<int[]> q = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int priority = Integer.parseInt(st.nextToken());
                q.add(new int[]{j, priority});
            }

            int count = 0;

            while (true) {
                int[] cur = q.poll();
                boolean hasHigher = false;

                for (int[] next : q) {
                    if (next[1] > cur[1]) { // 중요도 비교
                        hasHigher = true;
                        break;
                    }
                }

                if (hasHigher) {
                    q.add(cur); // 출력 못 하면 뒤로
                } else {
                    count++; // 출력
                    if (cur[0] == M) {
                        System.out.println(count);
                        break;
                    }
                }
            }
        }
    }
}