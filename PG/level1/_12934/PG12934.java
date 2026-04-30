package PG.level1._12934;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PG12934 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());

        Long x = (long) Math.sqrt(n);

        if(x * x == n){
            System.out.println((x + 1) * (x + 1));
        }
        else {
            System.out.println(-1);
        }
    }
}
