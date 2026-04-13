package BJ.bronze._2._2231;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ2231 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = 0;
        int digit = String.valueOf(N).length();
        int start = N - (9 * digit);

        if(start < 1){
            start = 1;
        }

        for(int i = start; i <= N; i++) {
            int sum = i;
            int num = i;

            while(num > 0){
                sum = sum + (num % 10);
                num /= 10;
            }

            if(sum == N){
                result = i;
                break;
            }
        }

        System.out.println(result);


    }
}
