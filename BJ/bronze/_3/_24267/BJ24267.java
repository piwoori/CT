package BJ.bronze._3._24267;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ24267 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(((long) N * (N - 1) * (N - 2)) / 6);
        System.out.println(3);
    }
}
