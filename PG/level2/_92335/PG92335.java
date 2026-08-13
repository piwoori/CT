package PG.level2._92335;

public class PG92335 {
    public int solution(int n, int k) {
        int answer = 0;

        String converted = Integer.toString(n, k); // n을 k진수로 변환

        String[] nums = converted.spit("0");

        for(String num : nums){
            if(num.equals("")){ // 00이 있어 num이 ""이 될 때
                continue;
            }

            long value = Long.parseLong(num);

            if(isPrime(value)){
                answer++;
            }
        }

        return answer;
    }

    private boolean isPrime(long num){
        if(num < 2){
            return false;
        }

        for(long i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}