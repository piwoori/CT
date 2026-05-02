package PG.level2._12924;

public class PG12924 {
    public int solution(int n){
        int cnt = 0;

        for(int i = 1; i <= n; i += 2){
            if(n % i == 0){
                cnt++;
            }
        }

        return cnt;
    }
}
