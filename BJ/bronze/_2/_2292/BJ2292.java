package BJ.bronze._2._2292;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ2292 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 1;
        int max = 1;

        while(N > max){
            max += 6 * cnt;
            cnt += 1;
        }

        System.out.println(cnt);
    }
}
