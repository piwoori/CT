package BJ.silver._4._1620;

import java.util.*;
import java.io.*;

public class BJ1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        String[] Numtoname = new String[M + 1];
        HashMap<String, Integer> map = new HashMap<>(M * 2);

        for(int i = 1; i <= M; i++) {
            String name = br.readLine();
            Numtoname[i] = name;
            map.put(name, i);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            String q = br.readLine();

            if(Character.isDigit(q.charAt(0))) {
                int idx = Integer.parseInt(q);
                sb.append(Numtoname[idx]).append('\n');
            }
            else{
                sb.append(map.get(q)).append('\n');
            }
        }

        System.out.println(sb);
    }
}