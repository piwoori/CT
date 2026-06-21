package PG.level1._12921;

public class PG12921 {
    public int solution(int n){
        boolean[] prime = new boolean[n + 1];

        for(int i = 2; i <= n; i++){
            prime[i] = true;
        }

        for(int i = 2; i * i <= n; i++){
            if(prime[i]){
                for(int j = i * i; j <= n; j += i){
                    prime[j] = false;
                }
            }
        }

        int answer = 0;

        for(int i = 2; i <= n; i++){
            if(prime[i]){
                answer++;
            }
        }

        return answer;

    }
}
