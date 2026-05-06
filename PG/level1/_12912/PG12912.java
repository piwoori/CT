package PG.level1._12912;

public class PG12912 {
    class Solution {
        public long solution(int a, int b) {
            int max = Math.max(a, b);
            int min = Math.min(a, b);

            return ((long)(min + max) * (max - min + 1)) / 2;
        }
    }
}
