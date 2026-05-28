package PG.level1._12930;

public class PG12930 {
    public String solution(String s) {
        int idx = 0;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == ' '){
                sb.append(' ');
                idx = 0;
            }
            else{
                if(idx % 2 == 0){
                    sb.append(Character.toUpperCase(c));
                }
                else{
                    sb.append(Character.toLowerCase(c));
                }
                idx++;
            }
        }

        return sb.toString();
    }
}
