package PG.level2._131701;

import java.util.HashSet;
import java.util.Set;

public class PG131701 {
    public int solution(int[] elements) {
        int n = elements.length;
        int[] list = new int[n * 2];

        for(int i = 0; i < n; i++) {
            list[i] = elements[i];
            list[i + n] = elements[i];
        }

        Set<Integer> set = new HashSet<>();

        for(int len = 1; len <= n; len++) {

            for(int start = 0; start < n; start++) {
                int sum = 0;

                for(int k = start; k < len + start; k++ ) {
                    sum += list[k];
                }

                set.add(sum);
            }
        }
        return set.size();
    }
}
