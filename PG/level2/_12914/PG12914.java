package PG.level2._12914;

public class PG12914 {
    public long solution(int n) {
        long prev = 1;
        long curr = 2;

        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }

        for(int i = 3; i <= n; i++){
            long next = (prev + curr) % 1234567;
            prev = curr;
            curr = next;
        }

        return curr;
    }
}
