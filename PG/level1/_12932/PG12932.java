package PG.level1._12932;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class PG12932 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        String s = Long.toString(n);
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            answer.add(s.charAt(i) - '0');
        }

        Collections.reverse(answer);

        System.out.println(answer);

    }
}
