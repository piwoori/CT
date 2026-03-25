package BJ.bronze._1._9506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BJ9506 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == -1){
                break;
            }

            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;

            for(int i = 1; i < N; i++){
                if(N % i == 0){
                    list.add(i);
                    sum += i;
                }
            }

            if(sum == N){
                sb.append(N).append(" = ");
                for(int i = 0; i < list.size() - 1; i++){
                    sb.append(list.get(i));
                    sb.append(" + ");
                }
                sb.append(list.get(list.size() - 1)).append("\n");

            }
            else{
                sb.append(N).append(" is NOT perfect.").append("\n");
            }

        }

        System.out.println(sb);
    }
}
