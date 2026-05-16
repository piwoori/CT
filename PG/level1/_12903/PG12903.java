package PG.level1._12903;

public class PG12903 {
    public String solution(String s) {
        int num = s.length() / 2;

        if (s.length() % 2 == 0) {
            return s.substring(num - 1, num + 1);
        }

        return s.substring(num, num + 1);
    }
}
