package PG.level2._12981;

import java.util.*;

public class PG12981 {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();

        set.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String prev = words[i - 1];
            String cur = words[i];

            // 틀릴 때
            if(prev.charAt(prev.length() - 1) != cur.charAt(0) || set.contains(cur)) {
                int person = (i % n) + 1;
                int turn = (i / n) + 1;

                return new int[]{person, turn};
            }

            set.add(cur);
        }

        return new int[]{0, 0};
    }
}
