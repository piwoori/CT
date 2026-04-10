package BJ.bronze._3._24266;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ24266 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println((long) N * N * N);
        System.out.println(3);
    }
}
