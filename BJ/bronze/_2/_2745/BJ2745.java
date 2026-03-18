package BJ.bronze._2._2745;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2745 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int temp = 1;
        int sum = 0;

        for(int i = N.length() - 1; i >= 0; i--) {
            char ch = N.charAt(i);

            if('A' <= ch && ch <= 'Z') {
                sum += (ch - 'A' + 10) * temp;
            }
            else{
                sum += (ch - '0') * temp;
            }
            temp *= B;
        }

        System.out.println(sum);
    }
}
