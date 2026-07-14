package PG.level2._84512;

public class PG84512 {

    char[] vowel = {'A', 'E', 'I', 'O', 'U'};

    int count = 0;
    int answer = 0;
    String target;

    public int solution(String word) {
        target = word;

        dfs("");

        return answer;
    }

    void dfs(String str){
        if(!str.equals("")){
            count++;

            if(str.equals(target)){
                answer = count;
                return;
            }
        }

        if(str.length() == 5){
            return;
        }

        for(char c : vowel){
            dfs(str + c);
        }
    }
}
