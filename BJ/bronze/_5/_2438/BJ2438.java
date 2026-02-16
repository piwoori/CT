package BJ.bronze._5._2438;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ2438 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        br.close();
    }
}
