package BJ.silver._5._25206;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ25206 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        double num = 0;
        for(int i = 0; i < 20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
             double x = Double.parseDouble(st.nextToken());
             String s = st.nextToken();
             if (s.equals("A+")){
                 sum += x * 4.5;
                 num += x;
             }
             else if (s.equals("A0")){
                 sum += x * 4.0;
                 num += x;
             }
             else if (s.equals("B+")){
                 sum += x * 3.5;
                 num += x;
             }
             else if (s.equals("B0")){
                 sum += x * 3.0;
                 num += x;
             }
             else if (s.equals("C+")){
                 sum += x * 2.5;
                 num += x;
             }
             else if (s.equals("C0")){
                 sum += x * 2.0;
                 num += x;
             }
             else if (s.equals("D+")){
                 sum += x * 1.5;
                 num += x;
             }
             else if (s.equals("D0")){
                 sum += x;
                 num += x;
             }
             else if(s.equals("F")){
                 num += x;
             }
        }
        System.out.println(sum / num);
    }
}
