package BJ.bronze._2._2675;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2675 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            StringBuilder line = new StringBuilder(S.length() * R);
            for(int j = 0; j < S.length(); j++) {
                for(int k = 0; k < R; k++) {
                    line.append(S.charAt(j));
                }
            }
            sb.append(line).append("\n");
        }

        System.out.println(sb);

    }
}
