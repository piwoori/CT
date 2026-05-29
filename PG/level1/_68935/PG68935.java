package PG.level1._68935;

public class PG68935 {
    public int solution(int n) {
        String tenary = Integer.toString(n, 3);

        String reversed = new StringBuilder(tenary).reverse().toString();
        return Integer.parseInt(reversed, 3);
    }
}
