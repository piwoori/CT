package PG.level1._147355;

public class PG147355 {
    public int solution(String t, String p) {
        int answer = 0;
        long num = Long.parseLong(p);

        for(int i = 0; i < t.length(); i++){
            long num_t = Long.parseLong(t.substring(i, i + 3));
            if(num_t <= num){
                answer++;
            }
        }
        return answer;
    }
}
