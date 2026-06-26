package PG.level1._140108;

public class PG140108 {
    public int solution(String s){
        int answer = 0;

        int same = 0;
        int diff = 0;

        char x = s.charAt(0);

        for(int i = 0; i < s.length(); i++){
            if(same == diff){
                answer++;
                x = s.charAt(i);
                same = 0;
                diff = 0;
            }

            if(x == s.charAt(i)){
                same++;
            }
            else{
                diff++;
            }
        }

        return answer;
    }
}
