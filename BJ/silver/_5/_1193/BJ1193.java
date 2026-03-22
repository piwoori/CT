package BJ.silver._5._1193;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ1193 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int floor = 1;

        while(N - floor > 0){
            N -= floor;
            floor++;
        }

        int box = N;
        int sum = floor + 1;
        int a = 0;
        int b = 0;

        if(floor % 2 == 0){
            b = box;
            a = sum - box;
        }

        else{
            a = box;
            b = sum - box;
        }

        System.out.println(b + "/" + a);

    }
}
