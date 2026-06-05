package PG.level1._81301;

public class PG81301 {
    public int solution(String s) {
        String[] list = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < list.length; i++) {
            s = s.replace(list[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}
