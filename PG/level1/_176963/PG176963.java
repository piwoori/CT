package PG.level1._176963;

import java.util.*;

public class PG176963 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];

        for(int i = 0; i < photo.length; i++) {
            int num = 0;

            for(String p : photo[i]) {
                num += map.getOrDefault(p, 0);
            }

            answer[i] = num;
        }

        return answer;
    }
}
