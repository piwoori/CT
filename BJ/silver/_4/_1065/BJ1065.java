package BJ.silver._4._1065;

import java.io.*;

public class BJ1065 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        if (N < 100){
            System.out.println(N);
        }
        else{
            cnt = 99;
            for (int i = 100; i <= N; i++){
                int hun = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if((hun - ten) == (ten - one)){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}