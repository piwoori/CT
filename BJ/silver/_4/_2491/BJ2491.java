package BJ.silver._4._2491;

import java.io.*;
import java.util.*;

public class BJ2491 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [] list = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        // 수열 길이가 1일 때
        if (N == 1){
            System.out.println(1);
            return;
        }

        int incLen = 1;
        int decLen = 1;
        int maxLen = 1;

        for(int i = 1; i < N; i++){
            // 증가 수열 판별
            if(list[i] >= list[i - 1]){
                incLen++;
            }
            else{
                incLen = 1;
            }

            // 감소 수열 판별
            if(list[i] <= list[i - 1]) {
                decLen++;
            }
            else{
                decLen = 1;
            }

            maxLen = Math.max(maxLen, Math.max(incLen, decLen));
        }

        System.out.println(maxLen);
        br.close();
    }
}
