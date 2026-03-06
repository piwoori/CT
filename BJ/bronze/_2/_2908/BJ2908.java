package BJ.bronze._2._2908;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2908 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        StringBuilder Asb = new StringBuilder();
        StringBuilder Bsb = new StringBuilder();

        for(int i = 2; i > -1; i--){
            Asb.append(A.charAt(i));
            Bsb.append(B.charAt(i));
        }

        int a = Integer.parseInt(Asb.toString());
        int b = Integer.parseInt(Bsb.toString());

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
