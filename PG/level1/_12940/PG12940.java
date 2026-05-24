package PG.level1._12940;

public class PG12940 {
    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }

        return a;
    }

    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = gcd(m, n);
        answer[1] = lcm(m, n);

        return answer;
    }
}
