package BJ.silver._4._14425;

import java.io.*;
import java.util.*;

public class BJ14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            if (list.contains(st.nextToken())) {
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
