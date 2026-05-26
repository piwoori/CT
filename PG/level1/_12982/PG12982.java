package PG.level1._12982;

import java.util.Arrays;

public class PG12982 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;

        Arrays.sort(d);

        for(int i = 0; i < d.length; i++) {
            sum += d[i];

            if(sum > budget) {
                break;
            }

            answer++;
        }

        return answer;
    }
}
