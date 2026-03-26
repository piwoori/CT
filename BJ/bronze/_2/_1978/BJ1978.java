package BJ.bronze._2._1978;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1978 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;

        for(int i = 0; i < N; i++) {
            int X = Integer.parseInt(st.nextToken());
            boolean is_prime = X != 1;

            for(int j = 2; j * j <= X; j++) {
                if(X % j == 0){
                    is_prime = false;
                    break;
                }
            }
            if(is_prime){
                count++;
            }
        }

        System.out.println(count);
    }
}
