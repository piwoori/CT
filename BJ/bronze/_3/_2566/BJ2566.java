package BJ.bronze._3._2566;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2566 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] list = new int[9][9];
        int max = Integer.MIN_VALUE;
        int max_col = 0;
        int max_row = 0;

        for(int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                list[i][j] = Integer.parseInt(st.nextToken());
                if(list[i][j] > max) {
                    max = list[i][j];
                    max_col = j + 1;
                    max_row = i + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(max_row + " " + max_col);
    }
}
