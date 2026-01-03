package BJ.silver._4._1269;

import java.io.*;
import java.util.*;

public class BJ1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        HashSet<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < A; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < B; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        br.close();
        System.out.println((set.size() - A) + (set.size() - B));
    }
}
