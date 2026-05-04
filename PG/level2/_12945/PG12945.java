package PG.level2._12945;

public class PG12945 {
    class Solution {
        public int solution(int n) {
            int prev = 0;
            int cur = 1;

            for(int i = 2; i <= n; i++){
                int next = (prev + cur) % 1234567;
                prev = cur;
                cur = next;
            }

            return cur;
        }
    }
}
