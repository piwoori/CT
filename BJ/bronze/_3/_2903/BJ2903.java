package BJ.bronze._3._2903;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ2903 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println((int)Math.pow(Math.pow(2, N) + 1, 2));
    }
}
