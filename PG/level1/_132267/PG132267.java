package PG.level1._132267;

public class PG132267 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int cola = (n / a) * b;

            answer += cola;

            n = cola + (n % a);
        }

        return answer;
    }
}
