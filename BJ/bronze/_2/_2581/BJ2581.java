package BJ.bronze._2._2581;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ2581 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int min = N;
        int sum = 0;

        for(int i = M; i <= N; i++) {
            boolean is_prime = i != 1;

            for(int j = 2; j * j <= i; j++){
                if(i % j == 0){
                    is_prime = false;
                    break;
                }
            }

            if(is_prime){
                sum += i;
                if(i < min) {
                    min = i;
                }
            }
        }

        if(sum > 0){
            System.out.println(sum);
            System.out.println(min);
        }
        else{
            System.out.println(-1);
        }
    }
}
