package PG.level1._12928;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PG12928 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 1; i <= n / 2; i++) {
            if(n % i == 0){
                sum += i;
            }
        }

        System.out.println(sum + n);
    }
}
