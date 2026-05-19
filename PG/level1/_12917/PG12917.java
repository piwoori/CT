package PG.level1._12917;

import java.util.Arrays;

public class PG12917 {
    public String solution(String s) {
        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(new String(arr));

        return sb.reverse().toString();
    }
}
