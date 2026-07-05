package PG.level1._131128;

public class PG131128 {
    public String solution(String X, String Y) {
        int[] cntX = new int[10];
        int[] cntY = new int[10];

        for(char c : X.toCharArray()) {
            cntX[c - '0']++;
        }

        for(char c : Y.toCharArray()) {
            cntY[c - '0']++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 9; i >= 0; i--){
            int count = Math.min(cntX[i], cntY[i]);

            for(int j = 0; j < count; j++){
                sb.append(i);
            }
        }

        if(sb.length() == 0){
            return "-1";
        }

        if(sb.charAt(0) == '0'){
            return "0";
        }

        return sb.toString();
    }
}
