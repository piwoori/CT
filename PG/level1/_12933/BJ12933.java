package PG.level1._12933;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ12933 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        char[] chars = String.valueOf(n).toCharArray();

        Arrays.sort(chars);

        for(int i = 0; i < chars.length / 2; i++){
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }

        System.out.println(Long.parseLong(new String(chars)));
    }
}
