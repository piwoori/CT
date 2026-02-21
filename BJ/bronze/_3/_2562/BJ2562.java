package BJ.bronze._3._2562;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ2562 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[9];
        int max = 0;
        int idx = 0;
        for(int i = 0; i < 9;i++ ) {
            list[i] = Integer.parseInt(br.readLine());
            if(list[i] > max){
                max = list[i];
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx + 1);
        br.close();
    }
}
