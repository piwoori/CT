package PG.level1._12915;

import java.util.Arrays;

public class PG12915 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            if(a.charAt(n) == b.charAt(n)) {
                return a.compareTo(b);
            }
            return a.charAt(n) - b.charAt(n);
        });

        return strings;
    }
}
