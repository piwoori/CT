package BJ.bronze._2._10811;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10811 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] list = new int[N];

        for(int i = 0; i < N; i++) {
            list[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            while(x < y){
                int temp = list[x - 1];
                list[x - 1] = list[y - 1];
                list[y - 1] = temp;
                x++;
                y--;
            }
        }

        for(int num: list){
            System.out.print(num + " ");
        }
    }
}
