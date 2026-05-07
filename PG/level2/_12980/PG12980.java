package PG.level2._12980;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PG12980 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int answer = 0;

        while(n > 0){
            if(n % 2 == 0){
                n /= 2;
            }
            else{
                n -= 1;
                answer++;
            }
        }

        System.out.println(answer);
    }
}
