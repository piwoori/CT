package PG.level1._87389;

public class PG87389 {
    class Solution {
        public int solution(int n) {
            int x = 0;
            while(true){
                x++;
                if(n % x == 1){
                    return x;
                }
            }
        }
    }
}