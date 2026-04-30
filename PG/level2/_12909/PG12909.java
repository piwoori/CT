package PG.level2._12909;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PG12909 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int cnt = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                cnt++;
            }
            else{
                cnt--;
            }
            if(cnt < 0){
                System.out.println("false");
                return;
            }
        }

        System.out.println(cnt == 0);

    }
}
