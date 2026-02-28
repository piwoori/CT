package BJ.bronze._5._9086;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ9086 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            System.out.println(s.charAt(0) + "" + s.charAt(s.length() - 1));
        }
    }
}
