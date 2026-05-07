package PG.level1._12916;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PG12916 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int p = 0;
        int y = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'p' || c == 'P') {
                p++;
            }
            if(c == 'y' || c == 'Y') {
                y++;
            }
        }

        if(p == y) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
