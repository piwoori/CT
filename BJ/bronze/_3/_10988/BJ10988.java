package BJ.bronze._3._10988;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class BJ10988 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String reversed = new StringBuilder(s).reverse().toString();
        if(s.equals(reversed)) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
