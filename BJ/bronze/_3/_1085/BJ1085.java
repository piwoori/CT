package BJ.bronze._3._1085;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1085 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int d = 1000;

        for(int i = 0; i < 4; i++){
            if(h - y < d){
                d = h - y;
            }

            if(x < d){
                d = x;
            }

            if(y < d){
                d = y;
            }

            if(w - x < d){
                d = w - x;
            }
        }

        System.out.println(d);
    }
}
