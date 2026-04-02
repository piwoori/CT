package BJ.bronze._3._9063;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ9063 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int min_x = 100001;
        int min_y = 100001;
        int max_x = -100001;
        int max_y = -100001;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(x > max_x) {
                max_x = x;
            }
            if(y > max_y) {
                max_y = y;
            }

            if(x < min_x) {
                min_x = x;
            }
            if(y < min_y) {
                min_y = y;
            }

        }

        System.out.println((max_x - min_x) * (max_y - min_y));
    }
}
