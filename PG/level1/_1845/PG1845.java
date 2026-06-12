package PG.level1._1845;

import java.util.HashSet;
import java.util.Set;

public class PG1845 {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        int maxPick = nums.length / 2;

        return Math.min(maxPick, set.size());
    }
}
