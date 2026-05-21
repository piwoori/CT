package PG.level1._12918;

public class PG12918 {
    public boolean solution(String s){
        boolean answer = true;
        if(s.length() == 4){
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(!Character.isDigit(c)){
                    answer = false;
                }
            }
        } else if (s.length() == 6) {
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!Character.isDigit(c)) {
                    answer = false;
                }
            }
        } else{
            answer = false;
        }

        return answer;
    }
}
