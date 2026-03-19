package BJ.bronze._1._11005;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11005 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while (N > 0){
            int k = N % B;
            N /= B;

            if(k >= 10){
                sb.append((char) (k + 55));
            }
            else{
                sb.append(k);
            }
        }

        System.out.println(sb.reverse());
    }
}

