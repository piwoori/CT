package PG.level2._17684;

import java.util.*;

public class PG17684 {
    public int[] solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < 26; i++){
            map.put(String.valueOf((char) ('A' + i)), i + 1);
        }

        int index = 27;
        int i = 0;

        while(i < msg.length()){
            String w = String.valueOf(msg.charAt(i));
            int j = i + 1;

            while(j < msg.length() && map.containsKey(msg.substring(i, j + 1))){
                w = msg.substring(i, j + 1);
                j++;
            }

            answer.add(map.get(w));

            if(j < msg.length()){
                String newWord = msg.substring(i, j + 1);
                map.put(newWord, index++);
            }

            i += w.length();
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
