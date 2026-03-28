package BJ.bronze._1._11653;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ11653 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 2; i * i <= N; i++){
            while(N % i == 0){
                System.out.println(i);
                N /= i;
            }
        }

        if(N > 1){
            System.out.println(N);
        }
    }
}
