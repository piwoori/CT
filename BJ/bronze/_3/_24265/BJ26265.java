package BJ.bronze._3._24265;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ26265 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long N = Long.parseLong(br.readLine());
        System.out.println((N * (N -1)) / 2);
        System.out.println(2);
    }
}
