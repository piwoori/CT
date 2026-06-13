package PG.level1._136798;

public class PG136798 {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i = 1; i <= number; i++) {
            int trival = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0){
                    trival++;
                }
            }

            if(trival <= limit) {
                answer += trival;
            }
            else{
                answer += power;
            }

        }

        return answer;
    }
}
