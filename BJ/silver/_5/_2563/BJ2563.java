package BJ.silver._5._2563;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2563 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int size = 0;
        int[][] list = new int[100][100];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int j = a; j < a + 10; j++) {
                for(int k = b; k < b + 10; k++) {
                    list[j][k] = 1;
                }
            }
        }

        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(list[i][j] == 1) {
                    size++;
                }
            }
        }
        System.out.println(size);
    }
}
