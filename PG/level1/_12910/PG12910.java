package PG.level1._12910;

import java.util.*;

public class PG12910 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int j : arr) {
            if (j % divisor == 0) {
                list.add(j);
            }
        }

        if(list.isEmpty()){
            return new int[]{-1};
        }

        Collections.sort(list);
        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
