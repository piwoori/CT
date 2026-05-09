package PG.level4._64063;

import java.util.*;

public class PG64063 {
    Map<Long, Long> map = new HashMap<>();

    public long find(long room){
        //  비어 있을 때
        if(!map.containsKey(room)){
            map.put(room, room + 1);
            return room;
        }

        // 이미 있으면 다음 방 탐색(재귀)
        long next = find(map.get(room));

        // 경로 압축
        map.put(room, next);

        return next;
    }

    public long[] solution(long k, long[] room_number) {
        long[] answer = new long[room_number.length];

        for(int i = 0; i < room_number.length; i++){
            answer[i] = find(room_number[i]);
        }

        return answer;
    }
}
