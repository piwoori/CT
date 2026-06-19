package PG.level1._133499;

public class PG133499 {
    public int solution(String[] babbling){
        int answer = 0;

        for(String word : babbling){

            if(word.contains("ayaaya") ||
                    word.contains("yeye") ||
                    word.contains("woowoo") ||
                    word.contains("mama")) {
                continue;
            }

            word = word.replace("aya", " ");
            word = word.replace("ye", " ");
            word = word.replace("woo", " ");
            word = word.replace("ma", " ");

            if(word.trim().isEmpty()) {
                answer++;
            }

        }

        return answer;

    }
}
