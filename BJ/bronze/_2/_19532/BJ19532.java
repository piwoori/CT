package BJ.bronze._2._19532;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ19532 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int ae_bd = a * e - b * d;
        int ce_bf = c * e - b * f;
        int af_cd = a * f - c * d;

        int X = ce_bf / ae_bd;
        int Y = af_cd / ae_bd;

        System.out.println(X + " " + Y);
    }
}
