package PG.level1._12931;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PG12931 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        while(n != 0){
            answer += n % 10;
            n /= 10;
        }

        System.out.println(answer);
    }
}
