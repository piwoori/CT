package BJ.silver._4._1822;

import java.io.*;
import java.util.*;

public class BJ1822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        TreeSet<Integer> set = new TreeSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < B; i++) {
            int x = Integer.parseInt(st.nextToken());
            set.remove(x);
        }

        sb.append(set.size() + "\n");
        for(Integer i : set) {
            sb.append(i + " ");
        }
        System.out.println(sb);
    }
}