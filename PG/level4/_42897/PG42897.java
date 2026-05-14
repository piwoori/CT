package PG.level4._42897;

public class PG42897 {
    public int solution(int[] money) {
        int n = money.length;

        return Math.max(
                rob(money, 0, n - 2),
                rob(money, 1, n - 1)
        );
    }

    private int rob(int[] money, int start, int end) {
        int prev2 = 0; // 전전
        int prev1 = 0; // 전

        for(int i = start; i <= end; i++) {
            int cur = Math.max(prev1, (prev2 + money[i]));
            prev2 = prev1;
            prev1 = cur;
        }

        return prev1;
    }
}
