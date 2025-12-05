package BJ.silver._4._4134;

import java.util.Scanner;

public class BJ4134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            long N = sc.nextLong();
            if(N <= 1){
                N = 2;
            }
            while(true){
                int count = 0;
                for(int j = 2; (long) j * j <= N; j++) {
                    if(N % j == 0){
                        count++;
                        break;
                    }
                }
                if(count == 0){
                    System.out.println(N);
                    break;
                }
                N++;
            }
        }
        sc.close();
    }
}
