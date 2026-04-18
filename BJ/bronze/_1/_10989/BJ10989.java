package BJ.bronze._1._10989;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ10989 {
    public static void main(String[] args) throws Exception {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] list = new int[N];

        for(int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            sb.append(list[i]).append("\n");
        }

        System.out.println(sb);

    }
}
