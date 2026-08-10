package PG.level2._42626;

import java.util.PriorityQueue;

public class PG42626 {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : scoville) {
            pq.add(num);
        }

        int answer = 0;

        while(pq.peek() < K){
            if(pq.size() < 2){
                return -1;
            }

            int first = pq.poll();
            int second = pq.poll();

            int mixed = first + (second * 2);

            pq.add(mixed);
            answer++;
        }

        return answer;
    }
}
