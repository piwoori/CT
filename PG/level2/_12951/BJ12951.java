package PG.level2._12951;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ12951 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean done = false;

        String s = br.readLine();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') {
                sb.append(c);
                done = false;
            }
            else{
                if(!done){
                    sb.append((Character.toUpperCase(c)));
                    done = true;
                }
                else{
                    sb.append((Character.toLowerCase(c)));
                }
            }
        }

        System.out.println(sb);
    }
}
