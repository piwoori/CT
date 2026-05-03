package PG.level1._12947;

public class PG12947 {
    class Solution {
        public boolean solution(int x) {
            String s = String.valueOf(x);
            int sum = 0;

            for(int i = 0; i < s.length(); i++){
                sum += s.charAt(i) - '0';
            }

            return x % sum == 0;
        }
    }
}
