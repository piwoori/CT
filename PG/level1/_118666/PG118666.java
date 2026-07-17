package PG.level1._118666;

import java.util.HashMap;
import java.util.Map;

public class PG118666 {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();

        char[] types = {'R','T','C','F','J','M','A','N'};

        for(char c : types){
            map.put(c, 0);
        }

        for(int i = 0; i < survey.length; i++){

            char left = survey[i].charAt(0);
            char right = survey[i].charAt(1);

            if(choices[i] < 4){
                map.put(left, map.get(left) + (4 - choices[i]));
            }
            else if (choices[i] > 4) {
                map.put(right, map.get(right) + (choices[i] - 4));
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append(map.get('R') >= map.get('T') ? 'R' : 'T');
        sb.append(map.get('C') >= map.get('F') ? 'C' : 'F');
        sb.append(map.get('J') >= map.get('M') ? 'J' : 'M');
        sb.append(map.get('A') >= map.get('N') ? 'A' : 'N');

        return sb.toString();
    }
}
