package PG.level2._42586;

import java.util.*;

public class PG42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();

        int prevDay = 0;
        int count = 0;

        for(int i = 0; i < progresses.length; i++) {
            int day = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);

            if(day > prevDay) {
                if(count > 0){
                    list.add(count);
                }

                prevDay = day;
                count = 1;
            }
            else{
                count++;
            }
        }

        list.add(count);

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
