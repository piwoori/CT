package PG.level1._150370;

import java.util.*;

public class PG150370{
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> map = new HAshMap<>();

        for(String term : terms){
            String[] split = term.split(" ");

            String type = split[0];
            int month = Integer.parseInt(split[1]);

            map.put(type, month);
        }

        int todayDate = convertDate(today);

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++){
            String[] split = privacies[i].split(" ");

            String date = split[0];
            String type = split[1];

            int startDate = converDate(date);

            int expireDate = startDate + map.get(type) * 28;

            if(expireDate <= todayDate){
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private int converDate(String date){
        String[] split = date.split("\\.");

        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);

        return year * 12 * 28 + month * 28 + day;
    }
}