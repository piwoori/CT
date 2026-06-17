package PG.level1._340199;

import java.util.Arrays;

public class PG340199 {
    public int solution(int[] wallet, int[] bill){
        int answer = 0;

        Arrays.sort(wallet);
        Arrays.sort(bill);

        while(bill[0] > wallet[0] || bill[1] > wallet[1]){
            bill[1] /= 2;
            Arrays.sort(bill);
            answer++;
        }

        return answer;
    }
}
