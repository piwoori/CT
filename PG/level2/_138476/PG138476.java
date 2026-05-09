package PG.level2._138476;

import java.util.*;

public class PG138476 {
    public int solution(int k, int[] tangerine) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());

        int cnt = 0;
        int answer = 0;

        for(int num : list) {
            cnt += num;
            answer++;

            if(cnt >= k){
                break;
            }
        }

        return answer;
    }
}
