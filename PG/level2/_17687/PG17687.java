package PG.level2._17687;

public class PG17687 {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();

        int num = 0;

        while(sb.length() < t * m){
            sb.append(Integer.toString(num, n).toUpperCase());
            num++;
        }

        StringBuilder answer = new StringBuilder();

        for(int i = p - 1; answer.length() < t; i += m){
            answer.append(sb.charAt(i));
        }

        return answer.toString();
    }
}
